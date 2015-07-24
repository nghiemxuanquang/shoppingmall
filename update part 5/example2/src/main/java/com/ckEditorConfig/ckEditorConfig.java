package com.ckEditorConfig;

import com.ckeditor.CKEditorConfig;
import java.util.*;
public class ckEditorConfig {
	public static CKEditorConfig createConfig() {
		CKEditorConfig config = new CKEditorConfig();
		List<Object> mainList = new ArrayList<Object>();				
		HashMap<String, Object> toolbarSectionMap = new HashMap<String, Object>();
		List<String> subList = new ArrayList<String>();
		
		toolbarSectionMap = new HashMap<String, Object>();
		subList = new ArrayList<String>();
		subList.add("Cut");	
		subList.add("Copy");
		subList.add("Paste");
		subList.add("PasteText");
		subList.add("PasteFromWord");
		subList.add("-");
		subList.add("Undo");
		subList.add("Redo");
		toolbarSectionMap.put("name", "clipboard");	
		toolbarSectionMap.put("items", subList);
		mainList.add(toolbarSectionMap);	
		
		toolbarSectionMap = new HashMap<String, Object>();
		subList = new ArrayList<String>();
		subList.add("Scayt");		
		toolbarSectionMap.put("name", "editing");	
		toolbarSectionMap.put("items", subList);
		mainList.add(toolbarSectionMap);
	
		toolbarSectionMap = new HashMap<String, Object>();
		subList = new ArrayList<String>();
		subList.add("Maximize");		
		toolbarSectionMap.put("name", "tools");	
		toolbarSectionMap.put("items", subList);
		mainList.add(toolbarSectionMap);
		
		toolbarSectionMap = new HashMap<String, Object>();
		subList = new ArrayList<String>();
		subList.add("Link");	
		subList.add("Unlink");
		subList.add("Anchor");
		toolbarSectionMap.put("name", "links");	
		toolbarSectionMap.put("items", subList);
		mainList.add(toolbarSectionMap);
		
		toolbarSectionMap = new HashMap<String, Object>();
		subList = new ArrayList<String>();
		subList.add("Bold");	
		subList.add("Italic");
		subList.add("Underline");
		subList.add("Strike");
		subList.add("-");
		subList.add("RemoveFormat");
		toolbarSectionMap.put("name", "basicstyles");	
		toolbarSectionMap.put("items", subList);
		mainList.add(toolbarSectionMap);
		
		toolbarSectionMap = new HashMap<String, Object>();
		subList = new ArrayList<String>();
		subList.add("Source");		
		toolbarSectionMap.put("name", "document");	
		toolbarSectionMap.put("items", subList);
		mainList.add(toolbarSectionMap);
		
		mainList.add("/");
		
		
		toolbarSectionMap = new HashMap<String, Object>();
		subList = new ArrayList<String>();
		subList.add("NumberedList");				
		subList.add("BulletedList");
		subList.add("-");
		subList.add("Outdent");
		subList.add("Indent");
		subList.add("-");
		subList.add("Blockquote");
		toolbarSectionMap.put("name", "paragraph");	
		toolbarSectionMap.put("items", subList);
		mainList.add(toolbarSectionMap);	
		
		
		
		toolbarSectionMap = new HashMap<String, Object>();
		subList = new ArrayList<String>();
		subList.add("Styles");				
		subList.add("Format");
		toolbarSectionMap.put("name", "styles");	
		toolbarSectionMap.put("items", subList);
		mainList.add(toolbarSectionMap);	
		
	

		config.addConfigValue("toolbar", mainList);
		config.addConfigValue("width","100%");
	
		config.addConfigValue("language", "en");
		config.addConfigValue("uiColor", "#F7B42C");
		return config;
	}
}
