package com.android.samples;
public final class R {
    public static final class string {
        public static final int greeting=0x0204000e;
        public static final int start_button_text=0x02040001;
        public static final int submit_button_text=0x02040008;
        public static final int main_screen_title=0x0204000a;
    };
    public static final class layout {
        public static final int start_screen=0x02070000;
        public static final int new_user_pane=0x02070001;
        public static final int select_user_list=0x02070002;


    };
    public static final class drawable {
        public static final int company_logo=0x02020005;
        public static final int smiling_cat=0x02020006;
        public static final int yellow_fade_background=0x02020007;
        public static final int stretch_button_1=0x02020008;


    };
};

// Load a background for the current screen from a drawable resource.
this.getWindow().setBackgroundDrawableResource(R.drawable.my_background_image);

// WRONG Sending a string resource reference into a 
// method that expects a string.
this.getWindow().setTitle(R.string.main_title);
// RIGHT Need to get the title from the Resources wrapper.
this.getWindow().setTitle(Resources.getText(R.string.main_title));

// Load a custom layout for the current screen.
setContentView(R.layout.main_screen);

// Set a slide in animation for a ViewFlipper object.
mFlipper.setInAnimation(AnimationUtils.loadAnimation(this, 
        R.anim.hyperspace_in));

// Set the text on a TextView object.
TextView msgTextView = (TextView)findViewByID(R.id.msg);
msgTextView.setText(R.string.hello_message);

public class MyActivity extends Activity
{
    public void onStart() 
    {
        requestScreenFeatures(FEATURE_BADGE_IMAGE);
        super.onStart();
        setBadgeResource(android.R.drawable.sym_def_app_icon);
    }
}



