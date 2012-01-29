package test

class NullChecking {

	public static void main(String[] args) {
		//check ? operator 
		int times = 100000
		def a = null
		
		def b
		
		
		long t1 = new Date().getTime()
		for (int i = 0; i < times; i++) {
			b = a?.class
		}
		long t1f = new Date().getTime() - t1
		println "Operator ?: \t " + t1f + "ms"
		
		long t2 = new Date().getTime()
		for (int i = 0; i < times; i++) {
			if(a!=null){
				b=a.class
			}else{
				b=null
			}
		
		}
		long t2f = new Date().getTime() - t2
		println "If clause:\t " + t2f + "ms"
	}
}
