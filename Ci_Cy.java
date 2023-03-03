package BaiTapLab3.BaiTapLab4;

public class Ci_Cy {
    public static void main(String[] args)
	{
		Cylinder data1 = new Cylinder(2.3 , " Red ", 4.2 ,  7.6);  
		System.out.println(data1.toString()+", "+data1.setHeight());
        System.out.println(data1.getVolume());
	}
}
