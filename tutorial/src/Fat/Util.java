package Fat;

public class Util {
    public int fatorial (int num) {
    	int f;
    	if (num == 0)
    		return 1;
    	f = num;
    	for (int i=f-1; i > 0; i--)
    		f = f*(num-i);
    	return f;
    }
	
}
