interface ProcessManager {
	public void create(int parentPCBIndex);
	public void delete(int pcbIndex);
}

class DynamicPM implements ProcessManager {
	DynamicPM() {}
	public void create(int parentPCBIndex) {}
	public void delete(int pcbIndex) {}
}

class StaticPM implements ProcessManager {
	StaticPM() {}
	public void create(int parentPCBIndex) {}
	public void delete(int pcbIndex) {}
}

class App {
	private static void TestPM(ProcessManager pm) {
		// number of times to run simulation
		final int REPEAT_COUNT = 100;
		// timestamps in nanoseconds
		long nsStart, nsEnd;
		// timestamp total in seconds
		double sTotal = 0;
		// run test
		for (int i = 0; i < REPEAT_COUNT; i++) {
			nsStart = System.nanoTime();
			pm.create(0);
			pm.create(0);
			pm.create(2);
			pm.create(0);
			pm.delete(0);
			nsEnd = System.nanoTime();
			sTotal += (double)(nsEnd - nsStart)/1000000000;
		}
		// calculate result
		final double averageSecsPerTest = sTotal/REPEAT_COUNT;
		// print result
		System.out.println("Avg secs per test: " + averageSecsPerTest);
	}
	public static void main(String[] args) {
		/* Test Dynamic Process Manager */
		System.out.println("Dynamic Process Manager");
		DynamicPM dynamicPM = new DynamicPM();
		TestPM(dynamicPM);
		/* Test Static Process Manager */
		System.out.println("Static Process Manager");
		StaticPM staticPM = new StaticPM();
		TestPM(staticPM);
	}
}