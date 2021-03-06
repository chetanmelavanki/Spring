package com.xworkz.train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.impl.ServiceImpl;
import com.xworkz.trainentity.TrainEntity;

@Component
@RequestMapping("/")
public class TrainController {
	@Autowired
	private ServiceImpl serviceImpl;
	// create
	public TrainController() {
		System.out.println(this.getClass().getSimpleName() + " bean created");
	}

	@RequestMapping("/getPDFResource")
	public String getPDFResource() {
		System.out.println("Invoked getPDFResource");
		return "/WEB-INF/CHETAN  MELAVANKI.pdf";

	}

	@RequestMapping("/getJPGresourse")
	public String getJPGresourse() {
		System.out.println("Invoked getJPGresourse");
		return "/WEB-INF/image.jpg";
	}

	@RequestMapping("/getSQLresource")
	public String getSQLresource() {
		System.out.println("Invoked getSQLresource");
		return "/WEB-INF/doctor.sql";
	}

	@RequestMapping("/getPDF1Resource")
	public String getPDF1Resource() {
		System.out.println("Invoked getPDF1Resource");
		return "/WEB-INF/SQL Commands.pdf";
	}

	@RequestMapping("/getXMLresource")
	public String getXMLresource() {
		System.out.println("Invoked getXMLresource");
		return "/WEB-INF/context-servlet.xml";
	}

	@RequestMapping("/getXML1resource")
	public String getXML1resource() {
		System.out.println("Invoked getXML1resourcee");
		return "/WEB-INF/web.xml";
	}

	@RequestMapping("/getXResourceLinks")
	public String getXResourceLinks() {
		System.out.println("Invoked getXML1resourcee");
		return "/WEB-INF/ResourceLinks.html";
	}

	@RequestMapping("/getFormFile")
	public String getFormFile() {
		System.out.println("Invoked getFormFile()");
		return "/WEB-INF/Form.html";
	}

	@RequestMapping("/readData")
	public String readData(@RequestParam String trainName, @RequestParam String trainColor,
			@RequestParam int trainSpeed, @RequestParam String trainCompartments) {
		System.out.println("Invoked readData()");

		System.out.println("Train Name=" + trainName);
		System.out.println("Train Color=" + trainColor);
		System.out.println("Train Speed=" + trainSpeed);
		System.out.println("Train Compartments=" + trainCompartments);

		return "/WEB-INF/Form.html";

	}
	@RequestMapping("/saveData")
	public String saveData(TrainEntity entity) {
		serviceImpl.validateTrainEntity(entity);
		System.out.println("Invoked saveData()");
		
		serviceImpl.saveToDb(entity);
		System.out.println("Saved to DB");
		return "/WEB-INF/Form.html";
		
	}
}
