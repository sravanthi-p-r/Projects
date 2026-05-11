public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView.(R.layout.main_layout);
}


/* Creates the menu items */
public boolean onCreateOptionsMenu(Menu menu) {
    menu.add(0, MENU_NEW_GAME, 0, "New Game");
    menu.add(0, MENU_QUIT, 0, "Quit");
    return true;
}


/* Handles item selections */
public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
    case MENU_NEW_GAME:
        newGame();
        return true;
    case MENU_QUIT:
        quit();
        return true;
        menu.add(0, MENU_QUIT, 0, "Quit")
    .setIcon(R.drawable.menu_quit_icon);

    }
    return false;
}

public void onCreateContextMenu(ContextMenu menu, View v,
                                ContextMenuInfo menuInfo) {
  super.onCreateContextMenu(menu, v, menuInfo);
  menu.add(0, EDIT_ID, 0, "Edit");
  menu.add(0, DELETE_ID, 0,  "Delete");
}


public boolean onContextItemSelected(MenuItem item) {
  AdapterContextMenuInfo info = (AdapterContextMenuInfo) item.getMenuInfo();
  switch (item.getItemId()) {
  case EDIT_ID:
    editNote(info.id);
    return true;
  case DELETE_ID:
    deleteNote(info.id);
    return true;
  default:
    return super.onContextItemSelected(item);
  }
}

public boolean onCreateOptionsMenu(Menu menu) {
  boolean result = super.onCreateOptionsMenu(menu);


  SubMenu fileMenu = menu.addSubMenu("File");
  SubMenu editMenu = menu.addSubMenu("Edit");
  fileMenu.add("new");
  fileMenu.add("open");
  fileMenu.add("save");
  editMenu.add("undo");
  editMenu.add("redo");
  return result;
}
public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.options_menu, menu);
    return true;
}

switch (item.getItemId()) {
case VIBRATE_SETTING_ID:
  if (item.isChecked()) item.setChecked(false);
  else item.setChecked(true);
  return true;
    SubMenu subMenu = menu.addSubMenu("Color");
subMenu.add(COLOR_MENU_GROUP, COLOR_RED_ID, 0, "Red");
subMenu.add(COLOR_MENU_GROUP, COLOR_BLUE_ID, 0, "Blue");
subMenu.setGroupCheckable(COLOR_MENU_GROUP, true, true);
MenuItem menuItem = menu.add(0, PHOTO_PICKER_ID, 0, "Select Photo");
menuItem.setIntent(new Intent(this, PhotoPicker.class));
}

public boolean onCreateOptionsMenu(Menu menu){
    super.onCreateOptionsMenu(menu);

static final int DIALOG_PAUSED_ID = 0;
static final int DIALOG_GAMEOVER_ID = 1;
    // Create an Intent that describes the requirements to fulfill, to be included
    // in our menu. The offering app must include a category value of Intent.CATEGORY_ALTERNATIVE. 
    Intent intent = new Intent(null, getIntent().getData());
    intent.addCategory(Intent.CATEGORY_ALTERNATIVE);    
    // Search for, and populate the menu with, acceptable offering applications.
    menu.addIntentOptions(
         thisClass.INTENT_OPTIONS,  // Menu group 
         0,      // Unique item ID (none)
         0,      // Order for the items (none)
         this.getComponentName(),   // The current Activity name
         null,   // Specific items to place first (none)
         intent, // Intent created above that describes our requirements
         0,      // Additional flags to control items (none)
         null);  // Array of MenuItems that corrolate to specific items (none)
    return true;
}

protected Dialog onCreateDialog(int id) {
    Dialog dialog;
    switch(id) {
    case DIALOG_PAUSED_ID:
        // do the work to define the pause Dialog
        break;
    case DIALOG_GAMEOVER_ID:
        // do the work to define the game over Dialog
        break;
    default:
        dialog = null;
    }
    return dialog;
}
AlertDialog.Builder builder = new AlertDialog.Builder(this);
builder.setMessage("Are you sure you want to exit?")
       .setCancelable(false)
       .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
           public void onClick(DialogInterface dialog, int id) {
                MyActivity.this.finish();
           }
       })
       .setNegativeButton("No", new DialogInterface.OnClickListener() {
           public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
           }
       });
AlertDialog alert = builder.create();
final CharSequence[] items = {"Red", "Green", "Blue"};
AlertDialog.Builder builder = new AlertDialog.Builder(this);
builder.setTitle("Pick a color");
builder.setItems(items, new DialogInterface.OnClickListener() {
    public void onClick(DialogInterface dialog, int item) {
        Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
    }
});
AlertDialog alert = builder.create();

final CharSequence[] items = {"Red", "Green", "Blue"};

AlertDialog.Builder builder = new AlertDialog.Builder(this);
builder.setTitle("Pick a color");
builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
    public void onClick(DialogInterface dialog, int item) {
        Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
    }
});
AlertDialog alert = builder.create();





