package module;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;

import bean.JasonTemplateBean;

public class MockDataService {
    public static MockDataService mockDataService;
    private ConcurrentSkipListMap<Integer, JasonTemplateBean> dataMap;

    public MockDataService() {
	dataMap = new ConcurrentSkipListMap<Integer, JasonTemplateBean>();
	dataMap.put(1, new JasonTemplateBean(1, "Mr. Nice"));
	dataMap.put(2, new JasonTemplateBean(2, "Narco"));
	dataMap.put(3, new JasonTemplateBean(3, "Bombasto"));
	dataMap.put(4, new JasonTemplateBean(4, "Celeritas"));
	dataMap.put(5, new JasonTemplateBean(5, "Magneta"));
	dataMap.put(6, new JasonTemplateBean(6, "RubberMan"));
	dataMap.put(7, new JasonTemplateBean(7, "Dynama"));
	dataMap.put(8, new JasonTemplateBean(8, "Dr IQ"));
	dataMap.put(9, new JasonTemplateBean(9, "Magma"));
	dataMap.put(10, new JasonTemplateBean(10, "Tornado"));

    }

    public static MockDataService getInstance() {
	if (mockDataService == null) {
	    mockDataService = new MockDataService();
	}
	return mockDataService;

    }

    public JasonTemplateBean getHero(int id) {
	return this.dataMap.get(id);
    }

    public ArrayList<JasonTemplateBean> getHeroByName(String keyword) {
	ArrayList<JasonTemplateBean> arrayList = new ArrayList<JasonTemplateBean>();
	for (JasonTemplateBean hero : this.dataMap.values()) {
	    if (hero.name.contains(keyword)) {
		arrayList.add(hero);
	    }
	}

	return arrayList;

    }
    
    public void addHeroByIdName(int id, String name){
	this.dataMap.put(id, new JasonTemplateBean(id,name));
    }
    
    public int getNewesId(){
	return this.dataMap.size();
    }
    
    public List<JasonTemplateBean> getAllHero(){
	return new ArrayList(this.dataMap.values());
    }
}
