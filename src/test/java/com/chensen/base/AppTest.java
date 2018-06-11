package com.chensen.base;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	boolean k;
	List<Integer> list = new ArrayList<Integer>();
	@Test
	public void test() {
//		int sum = zhishu(101,200);
//		System.out.println("sum的值："+sum);
		//System.out.println("要找的字符串个数："+search("sdfsf",'d'));
		//daoxu("abcdefg");
		hebing("yvxbcd","aefghtt");
		System.out.println();
		
	}
	
	public int search(String s,char c){
		char[] ch = s.toCharArray();
		List list = new ArrayList();
		int k=0;
		for(int i=0;i<ch.length;i++){
			list.add(ch[i]);
			//System.out.println(ch[i]);
			System.out.println("list数组为："+list.get(i));
		}
		for(int i=0;i<list.size();i++){
			System.out.println("是否相等"+list.get(i).equals(c));
			if(list.get(i).equals(c)){
				k++;
			}
		}
		System.out.println("ch数组为:"+ch.length);
		System.out.println("有几个:"+k);
		return k;
	}
	
	public void daoxu(String s){
		for(int i=s.length()-1;i>=0;i--){
			char c= s.charAt(i);
			System.out.println(c);
		}
	}
	
	public void hebing(String s1,String s2){
		char[] c = new char[s1.length()+s2.length()];
		int k =s1.length();
		for(int i=0;i<s1.length();i++){
			c[i]=s1.charAt(i);
		}
		
		for(int i=0;i<s2.length();i++){
			c[k]=s2.charAt(i);
			k++;
		}
		System.out.println(Arrays.toString(c));
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				if(c[i]>c[j]){
					char c1 = c[i];
					c[i]=c[j];
					c[j]=c1;
				}
			}
		}
		System.out.println(Arrays.toString(c));
		for(int i=0;i<c.length;i++){
			System.out.println("合并并排序后："+c[i]);
		}
		
	}
	
	public int zhishu(int x,int y){
		for(int i=x;i<=y;i++){
			k=true;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					k=false;
				}
				
			}
			if(k){
				list.add(i);
				System.out.println(i);
			}

		}
		
		return list.size();
	}
	
	class A{
		String s;
		public void test(){
			System.out.println("这是A");
		}
	}
	class B extends A{
		public void test(int B){
			System.out.println("这是B");
		}
		
		public void tt(){
			
		}
	}
}
