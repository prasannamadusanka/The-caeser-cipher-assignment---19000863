
object prasanna {

  def main(args:Array[String]){
    println("enter the string what you want to ecryption");
    Encryption();
    println("\n\nenter the string what you want to Decryption");
     Decryption();

  }




def Encryption(): Unit={
  
  	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size


	val inputText = scala.io.StdIn.readLine("Secret Message: ")

	val outputText = inputText.map( (c: Char) => {


		val x = alphabet.indexOf(c.toUpper)

		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
			}
	});

	println(outputText);
}






  def Decryption() : Unit={
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size


	val inputText = scala.io.StdIn.readLine("Secret Message: ")


	val outputText = inputText.map( (c: Char) => {


		val x = alphabet.indexOf(c.toUpper)

		if (x == -1){
			c
		}
		else{
		  var t=x-shift;
		  if(t<0)
		  {
		    alphabet((t+alphabet.size) % alphabet.size)
		  }
		  else
		  {
		   alphabet((x - shift) % alphabet.size)
		  }

			}

	});println(outputText);

  }

}
