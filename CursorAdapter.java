// Load a Spinner and bind it to a data query.
private static String[] PROJECTION = new String[] {
        People._ID, People.NAME
    };


Spinner s2 = (Spinner) findViewById(R.id.spinner2);
Cursor cur = managedQuery(People.CONTENT_URI, PROJECTION, null, null);
     
SimpleCursorAdapter adapter2 = new SimpleCursorAdapter(this,
    android.R.layout.simple_spinner_item, // Use a template
                                          // that displays a
                                          // text view
    cur, // Give the cursor to the list adatper
    new String[] {People.NAME}, // Map the NAME column in the
                                         // people database to...
    new int[] {android.R.id.text1}); // The "text1" view defined in
                                     // the XML template
					 
adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
s2.setAdapter(adapter2);

// Create a message handling object as an anonymous class.
private OnItemClickListener mMessageClickedHandler = new OnItemClickListener() {
    public void onItemClick(AdapterView parent, View v, int position, long id)
    {
        // Display a messagebox.
        Toast.makeText(mContext,"You've got an event",Toast.LENGTH_SHORT).show();
    }
};


// Now hook into our object and set its onItemClickListener member
// to our class handler object.
mHistoryView = (ListView)findViewById(R.id.history);
mHistoryView.setOnItemClickListener(mMessageClickedHandler); 
