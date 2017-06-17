package org.defascat.presentation.exceptions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Fernflower decompilation
 * @author andy
 */
public class TryWithResources {
    public static void main(String[] args) {
        try(InputStream is1 = new ByteArrayInputStream(new byte[0]);
                InputStream is2 = new ByteArrayInputStream(new byte[0])) {
        } catch (IOException e) {}
    }
}

/*
public class TryWithResources {
   public static void main(String[] args) {
      try {
         InputStream is1 = new ByteArrayInputStream(new byte[0]);
         Throwable var2 = null;

         try {
            InputStream is2 = new ByteArrayInputStream(new byte[0]);
            Object var4 = null;
            if (is2 != null) {
               if (var4 != null) {
                  try {
                     is2.close();
                  } catch (Throwable var15) {
                     ((Throwable)var4).addSuppressed(var15);
                  }
               } else {
                  is2.close();
               }
            }
         } catch (Throwable var16) {
            var2 = var16;
            throw var16;
         } finally {
            if (is1 != null) {
               if (var2 != null) {
                  try {
                     is1.close();
                  } catch (Throwable var14) {
                     var2.addSuppressed(var14);
                  }
               } else {
                  is1.close();
               }
            }

         }
      } catch (IOException var18) {
         ;
      }

   }
}

*/
