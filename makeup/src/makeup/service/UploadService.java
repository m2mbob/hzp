package makeup.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

public class UploadService {
	
	@SuppressWarnings("resource")
	public String uploadFile(File upload, String uploadFileName,String path)
			throws Exception {
		@SuppressWarnings("deprecation")
		String rootpath = ServletActionContext.getRequest().getRealPath(
				path);
		if (!new File(rootpath).exists()) {
			new File(rootpath).mkdirs();
		}
		String filepath = "/"
				+ new SimpleDateFormat("yyMMddHHmmss").format(new Date()) +(int)(Math.random()*10000)+ "."
				+ uploadFileName.substring(uploadFileName.lastIndexOf(".") + 1);

		String savepath = rootpath + filepath;
		FileOutputStream fos = new FileOutputStream(savepath);
		FileInputStream fis = new FileInputStream(upload);
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) > 0) {
			fos.write(buffer, 0, len);
		}
		return filepath;
	}

	public void deleteFile(String savePath,String path) {
		@SuppressWarnings("deprecation")
		String rootpath = ServletActionContext.getRequest().getRealPath(
				path);
		File file = new File(rootpath + savePath);
		
		if (file.exists()) {
			file.delete();
		}
	}

}
