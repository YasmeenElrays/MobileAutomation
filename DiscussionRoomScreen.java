package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class DiscussionRoomScreen extends PageBase {


    public DiscussionRoomScreen(AppiumDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ImageView")
    MobileElement DiscussionRoomModule;
    @FindBy(id="com.app.classera:id/floating_action_button_fragment_add_discussion")
    MobileElement addDiscussionRoom;
    @FindBy(id="com.app.classera:id/edit_text_fragment_discussion_room_title")
    MobileElement Title;
    @FindBy(id = "com.app.classera:id/edit_text_fragment_add_discussion_room_instructions")
    MobileElement roomInstruction;
    @FindBy(id="com.app.classera:id/edit_text_fragment_add_discussion_room_students")
    MobileElement selectStudent;
    @FindBy(id="com.app.classera:id/button_fragment_add_discussion_room_create")
    MobileElement createDiscussionRoomButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")
    MobileElement allStudentButton;
    @FindBy(id = "com.app.classera:id/item_menu_activity_filter_done")
    MobileElement CheckIcon;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout")
    MobileElement clickOnCreatedDiscussionRoom;
    @FindBy(id="com.app.classera:id/floating_action_button_fragment_add_post")
    public MobileElement addPostButton;
    @FindBy(id="com.app.classera:id/edit_text_fragment_add_post_text")
    MobileElement postText;
    @FindBy(id="com.app.classera:id/button_fragment_add_post_create")
    MobileElement createPostButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Write a comment…\" or @text=\"اضافة تعليق…\"]")
    MobileElement WriteCommentTestBox;
    @FindBy(id="com.app.classera:id/edit_text_fragment_discussion_comments_add_comment")
    MobileElement WriteCommentInsideCommentScreen;
    @FindBy(id = "com.app.classera:id/image_view_fragment_discussion_comments_add_comment_submit")
    MobileElement submitComment;
    @FindBy(id="com.app.classera:id/image_view_row_discussion_comment_more")
    MobileElement MoreActionInCommentScreen;
    @FindBy(id = "com.app.classera:id/title")
    MobileElement DeleteCommentOption;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    MobileElement clickBack;
    @FindBy(id="com.app.classera:id/image_view_row_discussion_post_more")
    MobileElement MoreActionInPostsScreen;
    @FindBy(id="com.app.classera:id/image_view_row_discussion_room_more")
    MobileElement MoreActionInDiscussionRoomScreen;
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.app.classera:id/title'][@text='Delete']")
    MobileElement clickOnDeleteDiscussionRoom;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    MobileElement MoreOptionInDiscussionRoomScreen;
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.app.classera:id/title'][@text=\"Disapprove and hide all topics/comments\" or @text=\"عدم الموافقة على جميع المواضيع / التعليقات و إخفائها\"]")
    MobileElement DisapproveOptionOnAllPosts;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.app.classera:id/text_view_row_discussion_post_approved\"][@text=\"غير موافق عليه\" or @text=\"Disapproved\"]")
    public MobileElement checkDisapproveText;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.app.classera:id/title\"][@text=\"Disapprove\" or @text=\"رفض\"]")
    MobileElement DisapproveComment;
    @FindBy(id = "com.app.classera:id/text_view_row_discussion_comment_approved")
    public MobileElement CheckDisapproveTextInCommentScreen;
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.app.classera:id/title'][@text=\"Stop topics/comments\" or @text=\"إيقاف المواضيع/ التعليقات\"]")
    MobileElement StopTopicsOption;
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.app.classera:id/title'][@text=\"Open topics/comments\" or @text=\"فتح المواضيع/ التعليقات\"]")
    MobileElement OpenTopicsOption;

    

    public void CreateDisRoom(){
        DiscussionRoomModule.click();
        addDiscussionRoom.click();
        Title.sendKeys("Test Room ");
        roomInstruction.sendKeys("Room instruction");
        selectStudent.click();
        allStudentButton.click();
        CheckIcon.click();
        createDiscussionRoomButton.click();

    }
    public void CreatePosts(){
        clickOnCreatedDiscussionRoom.click();
        addPostButton.click();
        postText.sendKeys("Test Post");
        createPostButton.click();
        //disapprove All Posts options
        MoreOptionInDiscussionRoomScreen.click();
        DisapproveOptionOnAllPosts.click();

    }
    public void StopTopicsAndCommentCheck()  {
        MoreOptionInDiscussionRoomScreen.click();
        StopTopicsOption.click();
//        if (addPostButton.isDisplayed()){
//            System.out.println("Add button displayed");
//        }
//        else {
//            System.out.println("Add button Not displayed ");
//        }
        MoreOptionInDiscussionRoomScreen.click();
        OpenTopicsOption.click();

    }
    public void AddCommentOnPosts() throws InterruptedException {
        WriteCommentTestBox.click();
        WriteCommentInsideCommentScreen.sendKeys("This Is Comment");
        submitComment.click();
        MoreActionInCommentScreen.click();
        DisapproveComment.click();
        Thread.sleep(1000);
    }
    public void DeleteComment(MobileDriver driver){
        MoreActionInCommentScreen.click();
        DeleteCommentOption.click();
        driver.switchTo().alert().dismiss();
        MoreActionInCommentScreen.click();
        DeleteCommentOption.click();
        driver.switchTo().alert().accept();
    }
    public void DeletePost(MobileDriver driver){
        clickBack.click();
        MoreActionInPostsScreen.click();
        DeleteCommentOption.click();
        driver.switchTo().alert().accept();
    }
    public void DeleteDiscussionRoom(MobileDriver driver){
        clickBack.click();
        MoreActionInDiscussionRoomScreen.click();
        clickOnDeleteDiscussionRoom.click();
        driver.switchTo().alert().accept();
    }

}
