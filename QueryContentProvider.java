import android.provider.Contacts.People;
import android.content.ContentUris;
import android.net.Uri;
import android.database.Cursor;


// Use the ContentUris method to produce the base URI for the contact with _ID == 23.
Uri myPerson = ContentUris.withAppendedId(People.CONTENT_URI, 23);


// Alternatively, use the Uri method to produce the base URI.
// It takes a string rather than an integer.
Uri myPerson = Uri.withAppendedPath(People.CONTENT_URI, "23");


// Then query for this specific record:
Cursor cur = managedQuery(myPerson, null, null, null, null);

import android.provider.Contacts.People;
import android.database.Cursor;


// Form an array specifying which columns to return. 
String[] projection = new String[] {
                             People._ID,
                             People._COUNT,
                             People.NAME,
                             People.NUMBER
                          };


// Get the base URI for the People table in the Contacts content provider.
Uri contacts =  People.CONTENT_URI;


// Make the query. 
Cursor managedCursor = managedQuery(contacts,
                         projection, // Which columns to return 
                         null,       // Which rows to return (all rows)
                         null,       // Selection arguments (none)
                         // Put the results in ascending order by name
                         People.NAME + " ASC");

import android.provider.Contacts.People;


private void getColumnData(Cursor cur){ 
    if (cur.moveToFirst()) {


        String name; 
        String phoneNumber; 
        int nameColumn = cur.getColumnIndex(People.NAME); 
        int phoneColumn = cur.getColumnIndex(People.NUMBER);
        String imagePath; 
    
        do {
            // Get the field values
            name = cur.getString(nameColumn);
            phoneNumber = cur.getString(phoneColumn);
           
	    // Do something with the values. 
            ... 


        } while (cur.moveToNext());


    }
}

