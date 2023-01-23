package sprede.pageFactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.yaml.snakeyaml.Yaml;


public class YamlPage {
    
    public String expectedTitle;
    public String path;
    public Boolean asynchronous;
    public Integer timeout;
    public Map<String, Object> page;
    public Map<String, YamlElement> yamlElements;
    public String context;
    
    public YamlPage(String root, String pageFile) throws Exception{
        
  
        //InputStream testSuiteYamlContentInputStream;
        String testSuiteYamlContent;
        System.out.println("root: "+root+" pageFile:"+pageFile);
        if(YamlPage.class.getResourceAsStream("/" + root+"/"+pageFile+".yaml")!=null){
        	//testSuiteYamlContentInputStream = YamlPage.class.getResourceAsStream("/" + root+"/"+pageFile+".yaml");
        	//testSuiteYamlContent=testSuiteYamlContentInputStream.toString();
            testSuiteYamlContent=IOUtils.toString(YamlPage.class.getResourceAsStream("/" + root+"/"+pageFile+".yaml"));
        }else{
        	//testSuiteYamlContentInputStream = YamlPage.class.getResourceAsStream("/" + root+"/"+pageFile+".yaml");
        	//testSuiteYamlContent=testSuiteYamlContentInputStream.toString();
            testSuiteYamlContent=IOUtils.toString(YamlPage.class.getResourceAsStream("/" + root+"/"+pageFile+".yaml"));
        }

        /** defaults **/
        this.timeout = 0;
        this.asynchronous = false;
        this.context = null;
        
        this.yamlElements = new HashMap();
        Yaml yaml = new Yaml();
        this.page = (Map<String, Object>)yaml.load(testSuiteYamlContent);

        if(page.containsKey("expectedTitle")){
            this.expectedTitle = page.get("expectedTitle").toString();
        }
        if(page.containsKey("path")){
            this.path = page.get("path").toString();
        }
        if(page.containsKey("asynchronous")){
            this.asynchronous = Boolean.valueOf(page.get("asynchronous").toString());
        }
        if(page.containsKey("timeout")){
            this.timeout = new Integer(page.get("timeout").toString());
        }
        if(page.containsKey("context")){
            this.context = page.get("context").toString();
        }
        
        /** init yaml elements **/
        Map<String, Map> elements = (Map<String, Map>)page.get("elements");
        for(int index=0; index<elements.size(); index++){
            String key = (String)elements.keySet().toArray()[index];
            yamlElements.put(key, new YamlElement(key, elements, timeout));
        }
    }
    
    public YamlElement element(String name){
        try{
            return yamlElements.get(name);
        }catch(NullPointerException e){
            throw new NullPointerException("Element '"+name+"' does not exist in Page Spec file");
        }
    }
    
    public YamlElement container(){
        return element("container");
    }
    
    public List<YamlElement> expectedElements(){
        List<YamlElement> expected = new ArrayList();
        for(String elementName:yamlElements.keySet()){
            if(yamlElements.get(elementName).isExpected){
                expected.add(yamlElements.get(elementName));
            }
        }
        return expected;
    }
}
