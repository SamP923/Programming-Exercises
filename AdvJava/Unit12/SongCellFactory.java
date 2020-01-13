import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class SongCellFactory implements Callback<ListView<Song>, ListCell<Song>>
{
	public ListCell<Song> call( ListView<Song> listview )
	{
		return new SongCell();
	}
} 