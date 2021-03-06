import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class ChunkChewer {
	
	public static void main(String[] args) throws IOException  {	
		/* This program takes a big string of text (or whatever you feed the BufferedReader object) 
		 * and prints out chunks of it, 256 characters at a time. 
		 */
		File f = new File("input.txt");									// input file you're reading from. make sure that you have the full file path in here (C:\Users\coreyonfire\Documents\input.txt) or else you'll get a file not found exception.
		int chunkCounter = 0;
		char[] myBuffer = new char[256];								// create new buffer. our characters will go here when they're read
		BufferedReader in = new BufferedReader(new FileReader(f));					// create the reader. this thing takes characters from a source (the string reader) until the buffer is full
		while (in.read(myBuffer,0,256) != -1)								// read the buffer, 256 characters at a time until the read() method returns -1 (meaning there's nothing left to read
		{
			
			PrintWriter writer = new PrintWriter("chunk-" + chunkCounter +".txt", "UTF-8");		// write the text out to the file. I have specified different file names for each chunk.
			writer.println(String.valueOf(myBuffer));						// print out what was in the buffer
			writer.close();										// close the writer
		    	myBuffer = new char[256];								// reset the buffer since read() doesn't erase what's in it when it starts putting chars back into the buffer.
		    	chunkCounter = chunkCounter + 1;							// increment the chunk counter so that i create a new file for the next chunk
		}
		in.close();											// close!
		f.close();
	}
	
	static String littleJunk = "corey";
	static String bigJunk = 	"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse mollis condimentum augue nec tincidunt. Proin lobortis imperdiet lacinia. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur ultricies velit mattis, pellentesque turpis eu, placerat enim. Pellentesque placerat laoreet arcu, ut consectetur ligula accumsan et. Morbi et vestibulum dolor, et faucibus massa. In non maximus augue, nec fringilla quam." +
			"Nulla sit amet eleifend arcu. Aenean vitae odio accumsan, fermentum libero eget, convallis felis. Cras volutpat erat dictum mattis porta. Donec sed eleifend augue. Maecenas quis velit vitae odio pellentesque dictum vitae sit amet nisi. Suspendisse et nibh vel sapien rhoncus venenatis et quis eros. Etiam accumsan arcu non laoreet porta. Suspendisse vel ante quis ipsum sagittis congue id sit amet quam. Nunc mauris nisi, placerat at nunc interdum, condimentum faucibus risus. Nunc vitae auctor leo, vel sollicitudin nibh. Morbi et dolor et sem fermentum vestibulum. Quisque volutpat ante quis gravida posuere. Cras dapibus quam magna, sed rhoncus nunc viverra nec." +
			"Cras at dui ac magna imperdiet porttitor. Aliquam finibus pretium viverra. Nullam id quam elementum, dictum erat quis, porttitor massa. Donec mollis elit at sapien convallis sodales. Donec dapibus dolor leo, at luctus tortor fringilla eget. Quisque eget pharetra tellus. Praesent gravida tincidunt pulvinar. Nulla sed nisi ornare eros tristique tempus id sagittis magna. Nulla gravida porta convallis. Vestibulum non porttitor purus." +
			"Mauris rutrum elementum elit quis commodo. Vivamus id maximus nunc. Phasellus sit amet felis odio. Duis volutpat tempus risus in congue. Integer odio neque, suscipit varius viverra nec, egestas sed augue. In tincidunt suscipit iaculis. Duis eget consectetur risus. Maecenas dictum iaculis ipsum vel lacinia. Curabitur vehicula nulla at neque tempor gravida. Ut vulputate porttitor est, sed vehicula sem pellentesque at." +
			"Quisque sit amet ligula sagittis, facilisis purus nec, tempus nunc. Vestibulum in ante et arcu congue rhoncus. Vestibulum sollicitudin aliquet varius. Curabitur vel massa aliquet, porttitor felis at, maximus turpis. Maecenas maximus, mi eu venenatis fermentum, diam tortor mattis enim, sed euismod arcu ante ac orci. Suspendisse sit amet est nibh. Praesent id ipsum at nunc venenatis sollicitudin. Mauris pharetra sem non ex feugiat, vel iaculis nunc dapibus." +
			"Vestibulum in interdum enim. Suspendisse a massa diam. Suspendisse egestas auctor velit, quis fermentum nibh. Phasellus id vulputate enim, et auctor lectus. Maecenas aliquam tortor laoreet, tempor tellus ut, fermentum arcu. Vivamus a justo ipsum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;" +
			"Curabitur dapibus est quis fringilla euismod. Sed sit amet fermentum lacus, vel vestibulum dui. Sed pulvinar dapibus lorem, quis ultricies libero finibus et. In a tincidunt quam. Duis a elit erat. Sed rhoncus dictum quam quis mattis. In eu dui tempus, lacinia metus et, sollicitudin orci. Vestibulum iaculis commodo leo eget ultrices. Vestibulum nunc ipsum, ultricies et ullamcorper dapibus, convallis et ex. Nulla facilisi. Donec nec luctus lorem, in lobortis erat. Phasellus dignissim accumsan eros in pulvinar. Nunc lectus ligula, vulputate non tempor eget, feugiat ac orci. In bibendum mi nec nunc imperdiet, ut mattis est gravida. Proin nec accumsan enim, a ullamcorper metus. Sed sed sem at dui lacinia auctor ut vel velit." +
			"Nullam ligula quam, gravida vel mollis sit amet, ultricies quis metus. Sed a feugiat elit. Nullam malesuada enim at pharetra ultrices. Nullam non justo sit amet eros varius faucibus a a neque. Vestibulum id vulputate ligula, mattis sagittis eros. Suspendisse erat arcu, iaculis a luctus nec, varius vel nunc. Nulla posuere, tortor a semper porta, ante orci sollicitudin metus, in ornare diam quam vitae lorem. Nulla hendrerit accumsan ex. Integer fringilla ullamcorper gravida. Cras consequat erat mi, efficitur pulvinar ipsum hendrerit non. Quisque sagittis luctus augue, nec efficitur ex tincidunt quis." +
			"Maecenas vel faucibus urna, id ornare urna. Morbi id orci quis dolor pellentesque placerat. Donec sed lorem metus. Donec iaculis urna arcu, at venenatis felis varius eleifend. Etiam at tellus euismod, hendrerit justo id, maximus orci. Donec nulla neque, dictum nec cursus sed, imperdiet placerat elit. Curabitur consectetur, lectus ut ultricies rutrum, metus ex dapibus purus, in aliquam dui tellus sed neque. Suspendisse potenti. Nulla facilisi. Aenean nec hendrerit sapien. Maecenas arcu orci, congue sed nisi eget, pulvinar pellentesque erat. Etiam gravida fermentum mauris viverra accumsan. Suspendisse justo diam, dapibus eu viverra sed, fermentum nec velit. Aliquam convallis ac ipsum in vehicula. Duis fermentum nisi semper, ultricies lectus non, auctor felis. Pellentesque porttitor rhoncus tempor." +
			"Mauris porta tortor volutpat erat dignissim aliquam. Nam porttitor hendrerit porta. Sed id consequat ligula. Morbi nec vehicula magna. Proin pharetra magna ac ligula pellentesque, ut venenatis est fringilla. Pellentesque at nunc fermentum, feugiat quam et, interdum elit. Sed accumsan lorem est, vitae mattis felis sodales non. Phasellus dui enim, aliquet ac diam ut, iaculis laoreet mi. Etiam non fermentum risus. In cursus vitae est non luctus. Quisque sed massa at metus vulputate scelerisque et id diam. Duis maximus sit amet lectus eget sollicitudin. Pellentesque posuere lectus tortor, quis aliquet risus elementum eget. Proin id vehicula neque. In maximus tempor nisl, non ornare dolor." +
			"Phasellus consequat at lorem nec malesuada. In hac habitasse platea dictumst. Fusce id eleifend orci. Integer eget euismod nisi, ut commodo risus. Curabitur ac sollicitudin lorem, non iaculis nisi. Cras tortor lacus, hendrerit at euismod nec, auctor eget augue. In porta ornare nunc, et vestibulum neque maximus quis. Sed sit amet nunc leo. Nunc euismod accumsan arcu, at imperdiet dolor congue ac. Integer ullamcorper facilisis luctus. Integer purus tortor, tempor quis metus vel, dictum lacinia mi. Fusce aliquam diam in lacinia condimentum. In faucibus, nisi sed auctor accumsan, enim ligula hendrerit dui, ac dictum mi tellus ac enim. In congue mi leo, sed pulvinar neque molestie ut." +
			"Quisque nec placerat nibh. Etiam ac elementum arcu. Vivamus venenatis mauris dolor, ac mollis quam sagittis eu. Aenean facilisis libero ac tortor egestas, ullamcorper varius erat fermentum. Fusce blandit gravida purus eget commodo. Mauris eu pulvinar neque. Vivamus rutrum elementum lacus a lacinia. Cras sed urna sagittis, egestas eros consectetur, condimentum ex. Curabitur eget magna vel nisi consequat fringilla. Mauris viverra nibh et rutrum convallis. Sed.";
}

/* NOTES:

You can replace the "new StringReader(bigJunk)" bit with anything you want, as long as the bufferedreader can read from it.
it can read from files, from strings, from anything that Readers can read. Google the Reader java class for more info.

*/
