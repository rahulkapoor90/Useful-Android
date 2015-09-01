@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buckysButton = (Button)findViewById(R.id.buckysButton);

        buckysButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView buckysText = (TextView)findViewById(R.id.buckysText);
                        buckysText.setText("Good Job");
                    }

                }
        );
        buckysButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView buckysText = (TextView)findViewById(R.id.buckysText);
                        buckysText.setText("something");
                        return true;
                    }
                }
        );
    }
    //remember to set up id of a button.
