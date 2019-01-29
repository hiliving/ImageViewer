package indi.liyi.viewer;


import android.view.View;
import android.widget.TextView;

import java.util.List;

import indi.liyi.viewer.listener.OnItemChangedListener;
import indi.liyi.viewer.listener.OnItemClickListener;
import indi.liyi.viewer.listener.OnItemLongClickListener;
import indi.liyi.viewer.listener.OnPreviewStatusListener;
import indi.liyi.viewer.sipr.BaseImageLoader;
import indi.liyi.viewer.sipr.ViewData;


public interface IImageViewer {
    /**
     * 获取图片索引的 view
     */
    TextView getIndexView();

    /**
     * 设置起始位置
     *
     * @param position
     */
    ImageViewer setStartPosition(int position);

    /**
     * 设置图片资源
     *
     * @param list
     */
    ImageViewer setImageData(List list);

    /**
     * 设置目标 view 的相关数据
     *
     * @param list
     */
    ImageViewer setViewData(List<ViewData> list);

    /**
     * 设置图片加载器
     *
     * @param loader
     */
    ImageViewer setImageLoader(BaseImageLoader loader);

    /**
     * 是否显示图片索引
     *
     * @param show
     */
    ImageViewer showIndex(boolean show);

    /**
     * 是否允许拖拽图片
     *
     * @param isDo
     */
    ImageViewer doDrag(boolean isDo);

    /**
     * 设置拖拽模式
     *
     * @param type
     */
    ImageViewer setDragType(int type);

    /**
     * 是否使用进场动画
     *
     * @param isDo
     */
    ImageViewer doEnterAnim(boolean isDo);

    /**
     * 是否使用退场动画
     *
     * @param isDo
     */
    ImageViewer doExitAnim(boolean isDo);

    /**
     * 设置进场与退场动画的执行时间
     *
     * @param duration
     */
    ImageViewer setDuration(int duration);

    /**
     * 设置图片的切换事件监听
     *
     * @param listener
     */
    ImageViewer setOnImageChangedListener(OnItemChangedListener listener);

    /**
     * 设置图片的单击事件监听
     *
     * @param listener
     */
    ImageViewer setOnItemClickListener(OnItemClickListener listener);

    /**
     * 设置图片的长按事件监听
     *
     * @param listener
     */
    ImageViewer setOnItemLongClickListener(OnItemLongClickListener listener);

    /**
     * 设置图片预览器的预览状态监听
     *
     * @param listener
     */
    ImageViewer setOnPreviewStatusListener(OnPreviewStatusListener listener);

    /**
     * 打开图片预览器
     */
    void watch();

    /**
     * 关闭图片预览器
     */
    void close();

    /**
     * 清除所有数据
     */
    void clear();

    /**
     * 获取图片预览器的当前状态
     *
     * @return {@link ImageViewerStatus}
     */
    @ImageViewerStatus
    int getViewState();

    /**
     * 是否允许图片缩放
     *
     * @param scaleable
     */
    ImageViewer setImageScaleable(boolean scaleable);

    /**
     * 图片是否可缩放
     *
     * @return
     */
    boolean isScaleable();

    /**
     * 获取图片当前的缩放等级
     *
     * @return
     */
    float getScale();

    /**
     * 设置图片的最大缩放等级
     *
     * @param maxScale
     */
    ImageViewer setMaxScale(float maxScale);

    /**
     * 获取图片的最大缩放等级
     *
     * @return
     */
    float getMaxScale();

    /**
     * 设置图片的最小缩放等级
     *
     * @param minScale
     */
    ImageViewer setMinScale(float minScale);

    /**
     * 获取图片的最小缩放等级
     *
     * @return
     */
    float getMinScale();

    /**
     * 获取当前的 view
     *
     * @return
     */
    View getCurrentItem();

    /**
     * 获取当前的 view 的位置
     *
     * @return
     */
    int getCurrentPosition();
}
