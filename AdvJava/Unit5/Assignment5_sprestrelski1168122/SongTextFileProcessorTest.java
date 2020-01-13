import java.io.*;
import java.util.*;
public class SongTextFileProcessorTest implements SongReader, SongWriter {
	private String fileName;
	private Scanner scan;
	public SongTextFileProcessorTest(String fileName) {
		this.fileName = fileName;
		try {
			scan = new Scanner(new File(fileName));
		}
		catch(Exception e){
			System.out.println(" ");
		}
	}
	public void writeSong(Song s) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true) ) );
			out.println(s.getSong());
			out.flush();
			out.close();
		}
		catch(IOException e) {
			System.out.println("Error occurred while opening the file");
		}
	}
	public Song readSong() {
		return new Song(scan.nextLine(),scan.nextLine(),scan.nextLine());
	}
}