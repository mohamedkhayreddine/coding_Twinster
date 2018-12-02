package com.mkyong.common;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;

import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;



@ManagedBean(name="ApiRequestBean")
@SessionScoped
public class ApiRequestBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> result = new ArrayList<String>();
	private List<Product> lstProd = new ArrayList<Product>(); 
	
	
	public List<Product> getlstProd(){
		return this.lstProd;
	}

	public List<String> getResult(){
		return this.result;
	}
    public void getSizes() throws IOException{
    	
    	Product p1 = new Product("product_2","TIGHT") ; 
    	Product p2 = new Product("product_2","NORMAL") ; 
    	Product p3 = new Product("product_2","LOOSE") ; 
    	

    	Product p4 = new Product("product_3","TIGHT") ; 
    	Product p5 = new Product("product_3","NORMAL") ; 
    	Product p6 = new Product("product_3","LOOSE") ; 
    	
    	
    	
        this.lstProd.add(p1);
        this.lstProd.add(p2);
        this.lstProd.add(p3);
        this.lstProd.add(p4);
        this.lstProd.add(p5);
        this.lstProd.add(p6);
        
        
        for (Product product : lstProd) {
        	 Gson gson = new Gson();
             StringEntity putParam = new StringEntity(gson.toJson(product));
             URL url = new URL("https://twinster.sizes.showmysize.com/api/sizefinder/");
             HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
             httpCon.setDoOutput(true);
             httpCon.setRequestMethod("PUT");
             OutputStream os = httpCon.getOutputStream();
             OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");    
             osw.write(putParam.toString());
             osw.flush();
             osw.close();
             os.close();  //don't forget to close the OutputStream
             httpCon.connect();

             //read the inputstream and print it
             String result;
             BufferedInputStream bis = new BufferedInputStream(httpCon.getInputStream());
             ByteArrayOutputStream buf = new ByteArrayOutputStream();
             int result2 = bis.read();
             while(result2 != -1) {
                 buf.write((byte) result2);
                 result2 = bis.read();
             }
             result = buf.toString();
             this.result.add(result);
           
        	
		}
        
       
    
    	
    	
    	
    	
    	
    }
 
    	
    	
	

}
