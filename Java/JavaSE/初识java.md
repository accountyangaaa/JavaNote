## Java的main方法

public static void main(String[] args){
		System.out.println("Hello");
		System.out.println("my name is:"+args[0]);
	}

<img src="C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220413154338944.png" alt="image-20220413154338944" style="zoom: 50%;" />

命令行传参 给main方法传递参数

运行：

![image-20220413154536286](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220413154536286.png)

![image-20220413155950866](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220413155950866.png)

一个类生成一个字节码文件，Java中用到哪个类就加载哪个类

Java是一门半编译型、半解释型语言。先通过javac编译程序把源文件进行编译，编译后生成的.class文件是由字节码组成的平台无关、面向JVM的文件。最后启动java虚拟机来运行.class文件，此时JVM会将字节码转换成平台能够理解的形式来运行。

<img src="C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220413160337596.png" alt="image-20220413160337596" style="zoom:50%;" />

书籍《深入理解Java虚拟机》



![image-20220413161135792](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220413161135792.png)

生成帮助文档：

javadoc -encoding UTF-8 -charset UTF-8 HelloWorld.java

## 数据类型与运算符

### 变量和类型

<img src="C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220413141822960.png" alt="image-20220413141822960" style="zoom:50%;" />

bit  --- byte---kb--- mb--- gb--- tb--- pb

<img src="C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220413161537694.png" alt="image-20220413161537694" style="zoom:50%;" />

1byte==8bit   1kb==1024byte


​		
	/**文档注释
	*/
	public class HelloWorld{
		/**
		* 1.int 几个字节 4个 不管你是多少位的操作系统 
		* 
		*/
		public static void main(String[] args){
			System.out.println("Hello");
			//System.out.println("my name is:"+args[0]);
		
		//整型变量 4个字节
		int num = 10;
		System.out.println(num);
		//表示的数据范围是-2^31->2^31-1
		//查看Java中的整型数据范围
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//长整型变量 8个字节
		long num1 = 10L;//最好用大写L
		System.out.println(num1);
		//数据范围 -2^63->2^63-1
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		//double型 8个字节
		double num2 = 1.0;
		System.out.println(num2);
		
		//神奇的代码1 Java中int除以int的值仍然是int（会直接舍弃小数部分）
		int a = 1;
		int b = 2;
		System.out.println(a/b);//0
		//得到0.5
		double a1 = 1.0;
		double b1 = 2.0;
		System.out.println(a1/b1);
		
		//神奇的代码2 在程序中小数是无限的
		double num3 = 1.1;
		System.out.println(num3*num3);
		
		//单精度浮点型变量,4个字节,一般优先考虑double
		float num4 = 1.0f;
		System.out.println(num4);
		
		//字符类型变量 java中占用2个字节
		char ch0 = 'A';
		char ch1 = '呵';//使用一个字符表示一个汉字
		System.out.println(ch1);
		
		//字节类型变量 1 个字节 表示范围-128->127
		byte value = 0;
		System.out.println(value);
		
		//短整型变量 2 个字节 ,一般不使用
		short value1 = 0;
		System.out.println(value1);
		
		//布尔型变量 java的boolean类型和int不能相互转换，
		//不存在1表示true，0表示false这样的用法
		boolean value2 = true;
		System.out.println(value2);
		
	}


​	
	public static void fun(String[] args){
			for(int i=0;i<args.length;i++){
				//System.out.println(args[i]);//行注释
				/*块注释
				System.out.println(args[0]);
				System.out.println(args[1]);
				System.out.println(args[2]);
				System.out.println(args[3]);
				*/
			}
	
			System.out.println("打印换行");	
			System.out.print("打印不换行");
			System.out.printf("%d\n",10);
		}
	}

​	