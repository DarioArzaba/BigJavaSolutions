/* 

14.- Give a possible implementation of the translate method of the Rectangle class.

A. There are multiple implementations, one would be:

	public void translate(int dx, int dy) {
		int newx = this.x + dx;
		this.x = newx;
		int newy = this.y + dy;
		this.y = newy;
	}


But the real one is:

	public void translate(int dx, int dy) {
	
			int oldv = this.x;
			int newv = oldv + dx;
	
			//Allow to move leftward if it does not negative overflow
			if (dx < 0) {
				if (newv > oldv) {
					if (width >= 0) {
						width += newv - Integer.MIN_VALUE;
					}
					newv = Integer.MIN_VALUE;
				}
			} else {
				// Move Rightward or staying still if positive overflow
				if (newv < oldv) {
					if (width >= 0) {
						width += newv - Integer.MAX_VALUE;
						if (width < 0) width = Integer.MAX_VALUE;
					}
					newv = Integer.MAX_VALUE;
				}
			}
			
			this.x = newv;
	
			oldv = this.y;
			newv = oldv + dy;
			
			//Allow to move upward if it does not negative overflow
			if (dy < 0) {
				if (newv > oldv) {
					if (height >= 0) {
						height += newv - Integer.MIN_VALUE;
					}
					newv = Integer.MIN_VALUE;
				}
			} else {
				// Move Rightward or staying still if positive overflow
				if (newv < oldv) {
					if (height >= 0) {
						height += newv - Integer.MAX_VALUE;
						if (height < 0) height = Integer.MAX_VALUE;
					}
					newv = Integer.MAX_VALUE;
				}
			}
			
			this.y = newv;
		
		}

*/

