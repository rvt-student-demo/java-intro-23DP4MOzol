package lv.rvt;

public class Statistics {

        private int count;
        private int sum;
    
        public Statistics() {
            this.count = 0; // Initialize count
            this.sum = 0;   // Initialize sum
        }
    
        public void addNumber(int number) {
            this.count++;        // Increment count
            this.sum += number;  // Add to sum
        }
    
        public int getCount() {
            return this.count; // Return count
        }
    
        public int sum() {
            return this.sum; // Return sum
        }
    
        public double average() {
            if (this.count == 0) {
                return 0; // Avoid division by zero
            }
            return (double) this.sum / this.count; // Calculate average
        }
    }
    
