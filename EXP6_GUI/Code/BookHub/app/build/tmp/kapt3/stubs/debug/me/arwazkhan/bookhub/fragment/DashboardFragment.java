package me.arwazkhan.bookhub.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\"\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lme/arwazkhan/bookhub/fragment/DashboardFragment;", "Landroidx/fragment/app/Fragment;", "()V", "bookInfoList", "Ljava/util/ArrayList;", "Lme/arwazkhan/bookhub/model/Book;", "getBookInfoList", "()Ljava/util/ArrayList;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "mcontext", "Landroid/content/Context;", "progressBar", "Landroid/widget/ProgressBar;", "progressLayout", "Landroid/widget/RelativeLayout;", "ratingComparator", "Ljava/util/Comparator;", "getRatingComparator", "()Ljava/util/Comparator;", "setRatingComparator", "(Ljava/util/Comparator;)V", "recyclerAdapter", "Lme/arwazkhan/bookhub/adapter/DashboardRecyclerAdapter;", "recyclerDashboard", "Landroidx/recyclerview/widget/RecyclerView;", "sharedPref", "Landroid/content/SharedPreferences;", "onAttach", "", "context", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class DashboardFragment extends androidx.fragment.app.Fragment {
    private androidx.recyclerview.widget.RecyclerView recyclerDashboard;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    private me.arwazkhan.bookhub.adapter.DashboardRecyclerAdapter recyclerAdapter;
    private android.widget.RelativeLayout progressLayout;
    private android.widget.ProgressBar progressBar;
    private android.content.Context mcontext;
    private final android.content.SharedPreferences sharedPref = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<me.arwazkhan.bookhub.model.Book> bookInfoList = null;
    @org.jetbrains.annotations.NotNull
    private java.util.Comparator<me.arwazkhan.bookhub.model.Book> ratingComparator;
    
    public DashboardFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<me.arwazkhan.bookhub.model.Book> getBookInfoList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Comparator<me.arwazkhan.bookhub.model.Book> getRatingComparator() {
        return null;
    }
    
    public final void setRatingComparator(@org.jetbrains.annotations.NotNull
    java.util.Comparator<me.arwazkhan.bookhub.model.Book> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
}