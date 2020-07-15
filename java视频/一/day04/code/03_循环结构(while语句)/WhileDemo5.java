/*
	我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m。
	请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?

	分析：
		A:定义一个统计变量，默认值是0
		B:最高山峰是珠穆朗玛峰：8848m这是最终的厚度
		  我现在有一张足够大的纸张，厚度为：0.01m这是初始厚度
		C:我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
		  折叠一次有什么变化呢?就是厚度是以前的2倍。
		D:只要每次变化的厚度没有超过珠穆朗玛峰的高度，就折叠，统计变量++
		E:输出统计变量。
*/

class WhileDemo5 {
	public static void main(String[] args) {
		//定义一个统计变量，默认值是0
		int count = 0;
		
		//最高山峰是珠穆朗玛峰：8848m这是最终的厚度
		//我现在有一张足够大的纸张，厚度为：0.01m这是初始厚度
		//为了简单，我把0.01变成1，同理8848就变成了884800
		int end = 884800;
		int start = 1;
		
		while(start<end) {
			//只要每次变化的厚度没有超过珠穆朗玛峰的高度，就折叠，统计变量++
			count++;
			
			//折叠一次有什么变化呢?就是厚度是以前的2倍。
			start *= 2;
			
			System.out.println("第"+count+"次厚度是"+start);
		}
		
		//输出统计变量。
		System.out.println("要叠"+count+"次");
	}
}