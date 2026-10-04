package com.gaia.ngallery.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ui.TimeBar;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingPlayerTimeBar extends ProgressBar implements TimeBar {
    public FloatingPlayerTimeBar(Context context) {
        super(context);
    }

    public static int a(long j10) {
        return (int) (j10 / 1000);
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void addListener(TimeBar.OnScrubListener onScrubListener) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void removeListener(TimeBar.OnScrubListener onScrubListener) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i10) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setBufferedPosition(long j10) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setDuration(long j10) {
        setMax((int) (j10 / 1000));
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setKeyCountIncrement(int i10) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setKeyTimeIncrement(long j10) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setPosition(long j10) {
        setProgress((int) (j10 / 1000));
    }

    public FloatingPlayerTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FloatingPlayerTimeBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
