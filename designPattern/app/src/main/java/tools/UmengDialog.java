package tools;
//builder模式

import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/**
 * Created by wangzhe on 2017/12/9.
 */

public class UmengDialog{

        private String mTitle = "";
        private String mMessage = "";
        private int mIcon = -1;

        /**
         * @Title: UmengDialog
         * @Description: UmengDialog Constructor
         * @param builder 将dialog参数传递给builder,够将好的builder传递给Dialog
         */
        private UmengDialog(Builder builder) {
            mTitle = builder.getTitle();
            mMessage = builder.getMessage();
            mIcon = builder.getIcon();
        }

        /**
         * @Title: show
         * @Description: show dialog
         * @throws
         */
        public void show() {
            System.out.println("显示窗口 : " + this);
        }

        /**
         * (非 Javadoc)
         *
         * @Title: toString
         * @Description:
         * @return
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString() {
            return "UmengDialog [mTitle=" + mTitle + ", mMessage=" + mMessage + ", mIcon=" + mIcon
                    + "]";
        }

        /**
         * @ClassName: Builder
         * @Description: Builder模式, 用于构建复杂的对象
         * @author Honghui He
         */
        public static class Builder {
            private String mDlgTitle = "";
            private String mDlgMessage = "";
            private int mDlgIcon = -1;

            /**
             * @Title: Builder
             * @Description: Builder Constructor
             */
            public Builder() {
            }

            /**
             * 获取 mDlgTitle
             *
             * @return 返回 mDlgTitle
             */
            public String getTitle() {
                return mDlgTitle;
            }

            /**
             * 设置 mDlgTitle
             *
             * @param 对mDlgTitle进行赋值
             */
            public Builder setTitle(String title) {
                this.mDlgTitle = title;
                return this;
            }

            /**
             * 获取 mDlgMessage
             *
             * @return 返回 mDlgMessage
             */
            public String getMessage() {
                return mDlgMessage;
            }

            /**
             * 设置 mDlgMessage
             *
             * @param 对mDlgMessage进行赋值
             */
            public Builder setMessage(String msg) {
                this.mDlgMessage = msg;
                return this;
            }

            /**
             * 获取 mDlgIcon
             *
             * @return 返回 mDlgIcon
             */
            public int getIcon() {
                return mDlgIcon;
            }

            /**
             * 设置 mDlgIcon
             *
             * @param 对mDlgIcon进行赋值
             */
            public Builder setIcon(int resId) {
                this.mDlgIcon = resId;
                return this;
            }

            /**
             * @Title: create
             * @Description: 创建窗口
             * @throws
             */
            public UmengDialog create() {
                return new UmengDialog(this);
            }
        }

    }
