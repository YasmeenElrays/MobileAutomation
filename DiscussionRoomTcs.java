package Tests;

import Pages.DiscussionRoomScreen;
import Pages.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DiscussionRoomTcs extends TestBase {

    @Test(priority = 1)
    public void AddDiscussionRoom() throws InterruptedException {
        DiscussionRoomScreen DisRoomObj=new DiscussionRoomScreen(driver);
        LoginScreen loginScreenObj=new LoginScreen(driver);
        loginScreenObj.Login();
        DisRoomObj.CreateDisRoom();
    }
    @Test(priority = 2)
    public void AddPosts(){
        DiscussionRoomScreen DisRoomObj=new DiscussionRoomScreen(driver);
        DisRoomObj.CreatePosts();
        Assert.assertEquals(DisRoomObj.checkDisapproveText.getText(),"Disapproved");
    }
    @Test(priority = 3)
    public void CheckStopTopicsOption(){
        DiscussionRoomScreen DisRoomObj=new DiscussionRoomScreen(driver);
        DisRoomObj.StopTopicsAndCommentCheck();
       // Assert.assertTrue(DisRoomObj.addPostButton.isDisplayed());
    }
    @Test(priority = 4)
    public void AddComments() throws InterruptedException {
        DiscussionRoomScreen DisRoomObj=new DiscussionRoomScreen(driver);
        DisRoomObj.AddCommentOnPosts();
        Assert.assertEquals(DisRoomObj.CheckDisapproveTextInCommentScreen.getText(),"Disapproved");
    }
    @Test(priority = 5)
    public void DeleteComment(){
        DiscussionRoomScreen DisRoomObj=new DiscussionRoomScreen(driver);
        DisRoomObj.DeleteComment(driver);
    }
    @Test(priority = 6)
    public void DeletePost(){
        DiscussionRoomScreen DisRoomObj=new DiscussionRoomScreen(driver);
        DisRoomObj.DeletePost(driver);
    }
    @Test(priority = 7)
    public void DeleteDiscussionRoom(){
        DiscussionRoomScreen DisRoomObj=new DiscussionRoomScreen(driver);
        DisRoomObj.DeleteDiscussionRoom(driver);
    }
}
