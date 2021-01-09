### Arrays Representation

1. What is an array?
    
Array is an indexed collection of fixed number of homogenous(same type) data elements
#### Advantage
* It can represent multiple values with same name
* Search operation can be performed easily
* Accessing an element is very easy & fast using index

#### Disadvantage
* Fixed in size
* Array is of homogenous type
* Insertion & deletion is a costly operation in an array

2. Declaring & initializing an array

#### Valid declaration ex.
* int[] a;
* int []a;
* int a[];
* int[] a1,b1;
* int[] a2[],b2;
* int[] a=new int[3];
* int[] a=new int[0];
* byte b=10; int[] b=new int[b];
* int[][] a=new int[3][4];
* int[][][] a=new int[3][4][];

#### Invalid declaration ex.
* int[] a,[]b;
* int[5] a;
* int[] a=new int[];
* int[] a=new int[-3];
* int[] a=new int[10.5];
* int[][][] a=new int[3][][5];

#### Valid initialization
* int[] a=new int[4];
a[0]=10;
a[1]=20;
a[2]=30;
a[3]=40;
* char[] ch={'a','e','i','o','u'};
* String[] s={"Hello","world","welcome"};  

#### Invalid initialization
* int[] a=new int[2]; a[2]=30; //ArrayIndexOutOfBoundsException
* int[] a; a = new int[3]; a = {4,6,9}; //Illegal start of expression

#### Rules for declaring & initializing an array
    1. We need to specify the size at the time of declaration
    2. We can have an array of size 0
    3. -ve size will give NegativeArraySizeException
    4. The maximum allowed array size in java is maximum value of int size [2147483647]

3. Accessing array
* String[] s={"Hello","world","welcome"}; s[0]; //Hello
* s[3] //ArrayIndexOutOfBoundsException

4. length Vs length()
#### length
* It is the final variable applicable only for arrays
* It represents the size of the array

#### length()
* It is a final method applicable for String objects
* It returns the no of characters present in the String

[Code Example](../src/com/suraj/array/ArrayBasic.java)