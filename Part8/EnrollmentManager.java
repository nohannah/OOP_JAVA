// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package Part8;
import java.util.*;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EnrollmentManager {
   private HashMap<Student, List<Course>> enrollmentMap = new HashMap();

   public EnrollmentManager() {
   }

   public void enrollStudentInCourse(Student var1, Course var2) {
      if (!this.enrollmentMap.containsKey(var1)) {
         this.enrollmentMap.put(var1, new ArrayList());
      }

      List var3 = (List)this.enrollmentMap.get(var1);
      PrintStream var10000;
      String var10001;
      if (!var3.contains(var2)) {
         var3.add(var2);
         var10000 = System.out;
         var10001 = var1.getName();
         var10000.println("Successfully enrolled " + var10001 + " in " + var2.getCourseCode());
      } else {
         var10000 = System.out;
         var10001 = var1.getName();
         var10000.println(var10001 + " is already enrolled in " + var2.getCourseCode());
      }

   }

   public List<Course> getStudentCourses(Student var1) {
      return (List)this.enrollmentMap.getOrDefault(var1, new ArrayList());
   }

   public boolean dropCourse(Student var1, Course var2) {
      if (this.enrollmentMap.containsKey(var1)) {
         List var3 = (List)this.enrollmentMap.get(var1);
         boolean var4 = var3.remove(var2);
         PrintStream var10000;
         String var10001;
         if (var4) {
            var10000 = System.out;
            var10001 = var2.getCourseCode();
            var10000.println("Successfully dropped " + var10001 + " for " + var1.getName());
            if (var3.isEmpty()) {
               this.enrollmentMap.remove(var1);
            }
         } else {
            var10000 = System.out;
            var10001 = var1.getName();
            var10000.println(var10001 + " is not enrolled in " + var2.getCourseCode());
         }

         return var4;
      } else {
         System.out.println("Student " + var1.getName() + " not found in enrollment records");
         return false;
      }
   }

   public int getTotalEnrollments() {
      int var1 = 0;

      List var3;
      for(Iterator var2 = this.enrollmentMap.values().iterator(); var2.hasNext(); var1 += var3.size()) {
         var3 = (List)var2.next();
      }

      return var1;
   }

   public void displayAllEnrollments() {
      System.out.println("\n=== Enrollment Map ===");
      if (this.enrollmentMap.isEmpty()) {
         System.out.println("No enrollments found.");
      } else {
         for(Iterator var1 = this.enrollmentMap.entrySet().iterator(); var1.hasNext(); System.out.println("---")) {
            Map.Entry var2 = (Map.Entry)var1.next();
            Student var3 = (Student)var2.getKey();
            List var4 = (List)var2.getValue();
            PrintStream var10000 = System.out;
            String var10001 = var3.getName();
            var10000.println("Student: " + var10001 + " (ID: " + var3.getStudentId() + ")");
            System.out.print("Courses: ");
            if (var4.isEmpty()) {
               System.out.println("None");
            } else {
               for(int var5 = 0; var5 < var4.size(); ++var5) {
                  System.out.print(((Course)var4.get(var5)).getCourseCode());
                  if (var5 < var4.size() - 1) {
                     System.out.print(", ");
                  }
               }

               System.out.println();
            }
         }

      }
   }

   public List<Student> getStudentsInCourse(Course var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.enrollmentMap.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         Student var5 = (Student)var4.getKey();
         List var6 = (List)var4.getValue();
         if (var6.contains(var1)) {
            var2.add(var5);
         }
      }

      return var2;
   }

   public HashMap<Student, List<Course>> getEnrollmentMap() {
      return this.enrollmentMap;
   }
}

