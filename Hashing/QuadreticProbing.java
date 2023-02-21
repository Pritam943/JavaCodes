

class Solution{
    //Function to fill the array elements into a hash table 
    //using Quadratic Probing to handle collisions.
    static void quadraticProbing(int[] hash, int hash_size, int arr[], int N)
    {
       
      
      //Storing -1 all indexes in the hash table.
      
      int size=0;
      for(int i=0; i< hash_size; i++){
          hash[i] = -1;
      }
      
         
         for(int i=0; i<N; i++){
             
             int key = arr[i]%hash_size;
         
          
          if(size==hash_size){
              break;
          }
          
          int x = 1;
          while(hash[key]!=-1 && hash[key]!=arr[i]){
              
              key=(arr[i]+(x*x))%hash_size;
             
              x++;
             
          }
            if(hash[key]==arr[i]){

                continue;

            }
            if(hash[key] == -1){
                  hash[key] =arr[i];
                  size++;
              }
              
         }
          
    }
}
