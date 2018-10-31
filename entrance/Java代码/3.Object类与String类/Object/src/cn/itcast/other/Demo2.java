package cn.itcast.other;

import java.io.IOException;
/*
 * Runtime 该类代表了应用程序运行的环境
 * 
 * getRuntime() 返回当前应用程序的运行环境
 * exec(String command)根据指定的路径执行对应的可执行文件
 * freeMemory() 返回jvm空闲的内容，以字节为单位
 * maxMemory() jvm试图管理的最大内存
 * totalMemory() jvm的内存总量
 */
public class Demo2 {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Runtime runtime = Runtime.getRuntime();
//		Process process = runtime.exec("E:\\a.txt");
//		
//		Thread.sleep(3000);
//		
//		process.destroy();
		
		System.out.println("jvm空闲内存"+runtime.freeMemory());
		System.out.println("jvm试图存储的最大内存："+runtime.maxMemory());
		System.out.println("jvm内存总量："+runtime.totalMemory());
	}

}
