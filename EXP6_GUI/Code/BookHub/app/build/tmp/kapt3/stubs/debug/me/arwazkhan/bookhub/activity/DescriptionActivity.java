package me.arwazkhan.bookhub.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lme/arwazkhan/bookhub/activity/DescriptionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "bookId", "", "btnAddToFav", "Landroid/widget/Button;", "imgBookImage", "Landroid/widget/ImageView;", "progressBar", "Landroid/widget/ProgressBar;", "progressLayout", "Landroid/widget/RelativeLayout;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "txtBookAuthor", "Landroid/widget/TextView;", "txtBookDesc", "txtBookName", "txtBookPrice", "txtBookRating", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "DBAsyncTask", "app_debug"})
public final class DescriptionActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.TextView txtBookName;
    private android.widget.TextView txtBookAuthor;
    private android.widget.TextView txtBookPrice;
    private android.widget.TextView txtBookRating;
    private android.widget.ImageView imgBookImage;
    private android.widget.TextView txtBookDesc;
    private android.widget.Button btnAddToFav;
    private android.widget.ProgressBar progressBar;
    private android.widget.RelativeLayout progressLayout;
    private androidx.appcompat.widget.Toolbar toolbar;
    private java.lang.String bookId = "100";
    
    public DescriptionActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ%\u0010\u000f\u001a\u00020\u00032\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0011\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lme/arwazkhan/bookhub/activity/DescriptionActivity$DBAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "bookEntity", "Lme/arwazkhan/bookhub/database/BookEntity;", "mode", "", "(Landroid/content/Context;Lme/arwazkhan/bookhub/database/BookEntity;I)V", "getContext", "()Landroid/content/Context;", "db", "Lme/arwazkhan/bookhub/database/BookDatabase;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "app_debug"})
    public static final class DBAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        private final me.arwazkhan.bookhub.database.BookEntity bookEntity = null;
        private final int mode = 0;
        private final me.arwazkhan.bookhub.database.BookDatabase db = null;
        
        public DBAsyncTask(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        me.arwazkhan.bookhub.database.BookEntity bookEntity, int mode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull
        java.lang.Void... p0) {
            return null;
        }
    }
}