package org.defascat.presentation.unsorted;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andy
 */
public class A3 {
    public static void main(String[] args) {
        final Map<B, Object> hashMap = new HashMap<>();
        final B b = new B();
        hashMap.put(b, "Test");
        b.setValue(22);
        System.out.println(hashMap.get(b));
    }
    
    static class B {
        private int value;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 23 * hash + this.value;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final B other = (B) obj;
            if (this.value != other.value) {
                return false;
            }
            return true;
        }

        
        
    }
}
