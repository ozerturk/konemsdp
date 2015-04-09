package com.msdp.kone.m2m.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.msdp.kone.m2m.client.Output;
import com.msdp.kone.m2m.sample.SingletonCounter;

public class ElevatorServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ElevatorServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DO GET KONE MSDP");
		String parameter = request.getParameter("hub.challenge");
		response.getWriter().print(parameter);
		response.setContentType("text/plain");
		response.setContentLength(parameter.length());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Incomming POST FROM M2MDM");

		System.out.println(request.toString());

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Output.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Output output = (Output) jaxbUnmarshaller.unmarshal(request.getReader());
			SingletonCounter.addM2mData(output);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
