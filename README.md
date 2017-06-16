
# hide-actionbar-in-android
This tips to hide ActionBar in your android app

# in MainActivity.java after 
super.onCreate(savedInstanceState);

AddAdd this : 

this.requestWindowFeature(Window.FEATURE_NO_TITLE);

# in style.xml add this item

&lt;item name=&quot;windowNoTitle&quot;&gt;true&lt;/item&gt; &lt;item name=&quot;windowActionBar&quot;&gt;false&lt;/item&gt;

