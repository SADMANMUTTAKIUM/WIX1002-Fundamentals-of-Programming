//a) Problem: Backslashes need to be escaped in file path
// Corrected:
PrintWriter out = new PrintWriter(new FileOutputStream("d:\\data\\matrix.txt"));
// OR better yet, use forward slashes:
PrintWriter out = new PrintWriter(new FileOutputStream("d:/data/matrix.txt"));


//b) Problem: Need to catch IOException instead of FileNotFoundException for PrintWriter
try {
    PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
    out.close();
} catch (IOException e) {
    System.out.println("Problem with file output");
}


//c) Problem: Scanner doesn't have readInt() method, use nextInt()
int num;
Scanner a = new Scanner(new FileInputStream("data.dat"));
num = a.nextInt();
a.close();


//d) Problem: ObjectOutputStream doesn't have print() method, use writeChar()
ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("data.dat"));
o.writeChar('A');
o.close();