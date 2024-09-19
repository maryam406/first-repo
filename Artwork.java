public class Artwork{
    
         private String title;
         private int year;
         private Artist artist;
    
         Artwork(Artwork a){
           this.title=a.getTitle();
           this.year=a.getYear();
           this.artist=a.getartist();//shallow copy 
            this.artist=new Artist(a.get Artist());//Deep copy
           
}
        
        Artwork(String title, int year, Artist artist){
            this.title=title;
            this.year=year;
            this.artist=artist;}
       
          public void settitle(){
               this.title=title;
}
          public void setyear(){
               this.year=year;
}
          public String gettitle(){
               return title;}
         public int getyear(){
               return year;}
 
     void display(){
       System.out.println("Name:");
       art();
       System.out.println("Title:"+title);
       System.out.println("Year:"+year);
      
 
    }
         
 
      
}