package InheritanceExample;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=3;
		a[1][1]=5;
		a[1][2]=6;
	
		int b[][] = {{2,4,5},{3,4,7},{1,2,9}};
		int min = b[0][0];
		//System.out.println(b[2][1]);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(b[i][j]<min)
				{
					min=b[i][j];
				}
			}
	}	
		System.out.println(min);
	}
}

