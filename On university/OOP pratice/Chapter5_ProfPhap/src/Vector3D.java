

class Vector3D{
     int x,y,z;
     Vector3D(int x, int y, int z){
               this.x = x;
               this.y = y;
               this.z = z;
     }

     static int dotProduct(Vector3D v1, Vector3D v2){
             return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
     }

     static Vector3D subtract(Vector3D v1, Vector3D v2){
           return new Vector3D(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
     }

     
}