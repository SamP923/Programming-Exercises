import javafx.scene.control.ListCell;

public class SongCell extends ListCell<Song>
{
	public void updateItem( Song item, boolean empty )
	{
		super.updateItem( item, empty );
		
		int index = this.getIndex();
		String name = null;

		if ( item == null || empty )
		{}
		else
		{
			name = ( index + 1 ) + ". " +
			item.getTitle() + ", " +
			item.getArtist() + ", " +
			item.getPrice();
		}
		this.setText( name );
		setGraphic( null );
	}
}