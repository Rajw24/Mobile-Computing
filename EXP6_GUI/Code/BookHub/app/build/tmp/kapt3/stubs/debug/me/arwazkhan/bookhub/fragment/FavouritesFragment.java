package me.arwazkhan.bookhub.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lme/arwazkhan/bookhub/fragment/FavouritesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "dbBookList", "", "Lme/arwazkhan/bookhub/database/BookEntity;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "progressBar", "Landroid/widget/ProgressBar;", "progressLayout", "Landroid/widget/RelativeLayout;", "recyclerAdapter", "Lme/arwazkhan/bookhub/adapter/FavouriteRecyclerAdapter;", "recyclerFavourite", "Landroidx/recyclerview/widget/RecyclerView;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "RetrieveFavourites", "app_debug"})
public final class FavouritesFragment extends androidx.fragment.app.Fragment {
    private androidx.recyclerview.widget.RecyclerView recyclerFavourite;
    private android.widget.RelativeLayout progressLayout;
    private android.widget.ProgressBar progressBar;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    private me.arwazkhan.bookhub.adapter.FavouriteRecyclerAdapter recyclerAdapter;
    private java.util.List<me.arwazkhan.bookhub.database.BookEntity> dbBookList;
    
    public FavouritesFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lme/arwazkhan/bookhub/fragment/FavouritesFragment$RetrieveFavourites;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lme/arwazkhan/bookhub/database/BookEntity;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class RetrieveFavourites extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends me.arwazkhan.bookhub.database.BookEntity>> {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        
        public RetrieveFavourites(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        protected java.util.List<me.arwazkhan.bookhub.database.BookEntity> doInBackground(@org.jetbrains.annotations.NotNull
        java.lang.Void... p0) {
            return null;
        }
    }
}