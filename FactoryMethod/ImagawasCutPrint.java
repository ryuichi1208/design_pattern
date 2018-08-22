public class ImagawasCutPrint extends CutPrint{
    protected void draw(Cuttable hanzai){
         System.out.println("draw comic");
    }
    protected void cut(Cuttable hanzai){
         System.out.println("cut");
    }
    protected void  print(Cuttable hanzai){
         System.out.println("print");
    }
    protected Cuttable createCuttable(){
        return new Potato();
    }
}
