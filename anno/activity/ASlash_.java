//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.1.
//


package activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.softcsoftware.aio.R.id;
import com.softcsoftware.aio.R.layout;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class ASlash_
        extends ASlash
        implements HasViews, OnViewChangedListener {

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    public static ASlash_.IntentBuilder_ intent(Context context) {
        return new ASlash_.IntentBuilder_(context);
    }

    public static ASlash_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new ASlash_.IntentBuilder_(fragment);
    }

    public static ASlash_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new ASlash_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.slash_activity);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        title = ((TextView) hasViews.findViewById(id.title));
        companyInfo = ((TextView) hasViews.findViewById(id.version));
        update_ui();
    }

    public static class IntentBuilder_
            extends ActivityIntentBuilder<ASlash_.IntentBuilder_> {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, ASlash_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), ASlash_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), ASlash_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_ != null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_ != null) {
                    fragment_.startActivityForResult(intent, requestCode);
                } else {
                    super.startForResult(requestCode);
                }
            }
        }

    }

}
