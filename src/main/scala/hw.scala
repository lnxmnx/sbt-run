import org.opencv.core.Mat;
import org.opencv.core.CvType;

object Hi {
  def main(args: Array[String]) = {
    System.load("/home/username/sbt-run/lib/libopencv_java247.so")
    val m  = Mat.eye(3, 3, CvType.CV_8UC1)
    println("m = " + m.dump())
  }
}