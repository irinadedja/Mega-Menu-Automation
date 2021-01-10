package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MegaMenuTest extends BaseTest {

    public void jobsMain() {
        WebElement jobs = driver.findElement(By.xpath("//*[@id=\"block-mainnavigation-2\"]/div/div/div/ul/li[1]/span"));
        pageWait.until(ExpectedConditions.visibilityOf(jobs)).isDisplayed();
        Assert.assertEquals(jobs.getText(), "JOBS");
        jobs.click();
    }

    public void teflMain() {
        WebElement tefl = driver.findElement(By.xpath("//*[@id=\"block-mainnavigation-2\"]/div/div/div/ul/li[2]/span"));
        pageWait.until(ExpectedConditions.visibilityOf(tefl)).isDisplayed();
        Assert.assertEquals(tefl.getText(), "TEFL");
        tefl.click();
    }

    public void teacherCertificationMain() {
        WebElement teachercertification = driver.findElement(By.xpath("//*[@id=\"block-mainnavigation-2\"]/div/div/div/ul/li[3]/span"));
        pageWait.until(ExpectedConditions.visibilityOf(teachercertification)).isDisplayed();
        Assert.assertEquals(teachercertification.getText(), "TEACHER CERTIFICATION");
        teachercertification.click();
    }

    public void cancel() {
        WebElement decline = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/button"));
        pageWait.until(ExpectedConditions.visibilityOf(decline)).isDisplayed();
        decline.click();
    }

    @Test
    public void MegaMenuValidation() throws InterruptedException {

        WebElement menu = driver.findElement(By.id("block-mainnavigation-2"));
        pageWait.until(ExpectedConditions.visibilityOf(menu)).isDisplayed();

        cancel();

        jobsMain();

        WebElement jobBoard = driver.findElement(By.xpath("//*[@id=\"tb-megamenu-column-1\"]/div/ul/li[1]/a"));
        pageWait.until(ExpectedConditions.visibilityOf(jobBoard)).isDisplayed();
        Assert.assertEquals(jobBoard.getText(), "Job Board");
        jobBoard.click();
        driver.navigate().back();

        cancel();
        jobsMain();

        WebElement destinations = driver.findElement(By.xpath("//*[@id=\"tb-megamenu-column-1\"]/div/ul/li[2]/span"));
        pageWait.until(ExpectedConditions.visibilityOf(destinations)).isDisplayed();
        Assert.assertEquals(destinations.getText(), "Destinations");
        destinations.click();

        WebElement featuredPrograms = driver.findElement(By.xpath("//*[@id=\"tb-megamenu-column-1\"]/div/ul/li[3]/span"));
        pageWait.until(ExpectedConditions.visibilityOf(featuredPrograms)).isDisplayed();
        Assert.assertEquals(featuredPrograms.getText(), "Featured Programs");
        featuredPrograms.click();

        WebElement jobopenings = driver.findElement(By.xpath("//*[@id=\"tb-megamenu-column-1\"]/div/ul/li[4]/span"));
        pageWait.until(ExpectedConditions.visibilityOf(jobopenings)).isDisplayed();
        Assert.assertEquals(jobopenings.getText(), "Job Openings");
        jobopenings.click();

        WebElement teachInTheUS = driver.findElement(By.xpath("//body/div[2]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/span[1]"));
        pageWait.until(ExpectedConditions.visibilityOf(teachInTheUS)).isDisplayed();
        Assert.assertEquals(teachInTheUS.getText(), "Teach in the US");
        teachInTheUS.click();

        WebElement community = driver.findElement(By.xpath("//*[@id=\"tb-megamenu-column-1\"]/div/ul/li[6]/span"));
        pageWait.until(ExpectedConditions.visibilityOf(community)).isDisplayed();
        Assert.assertEquals(community.getText(), "Community");
        community.click();

        jobsMain();

        teflMain();
        WebElement tEFLCourses = driver.findElement(By.xpath("//*[@id=\"tb-megamenu-column-10\"]/div/ul/li[1]/a"));
        pageWait.until(ExpectedConditions.visibilityOf(tEFLCourses)).isDisplayed();
        Assert.assertEquals(tEFLCourses.getText(), "TEFL Courses");
        tEFLCourses.click();
        driver.navigate().back();

        cancel();

        teflMain();
        WebElement tEFLCertificationGuide = driver.findElement(By.xpath("//*[@id=\"tb-megamenu-column-10\"]/div/ul/li[2]/a"));
        pageWait.until(ExpectedConditions.visibilityOf(tEFLCertificationGuide)).isDisplayed();
        Assert.assertEquals(tEFLCertificationGuide.getText(), "TEFL Certification Guide");
        tEFLCertificationGuide.click();
        driver.navigate().back();

        cancel();

        teflMain();

        teacherCertificationMain();
        WebElement teacherCertificationGuide = driver.findElement(By.xpath("//*[@id=\"tb-megamenu-column-11\"]/div/ul/li[1]/a"));
        pageWait.until(ExpectedConditions.visibilityOf(teacherCertificationGuide)).isDisplayed();
        Assert.assertEquals(teacherCertificationGuide.getText(), "Teacher Certification Guide");
        teacherCertificationGuide.click();
        driver.navigate().back();

        cancel();

        teacherCertificationMain();
        WebElement certificationPrograms = driver.findElement(By.xpath("//*[@id=\"tb-megamenu-column-11\"]/div/ul/li[2]/a"));
        pageWait.until(ExpectedConditions.visibilityOf(certificationPrograms)).isDisplayed();
        Assert.assertEquals(certificationPrograms.getText(), "Certification Programs");
        certificationPrograms.click();
        driver.navigate().back();

        cancel();

        teacherCertificationMain();
        WebElement hawaii = driver.findElement(By.xpath("//*[@id=\"tb-megamenu-column-11\"]/div/ul/li[3]/a"));
        pageWait.until(ExpectedConditions.visibilityOf(hawaii)).isDisplayed();
        Assert.assertEquals(hawaii.getText(), "Hawai'i");
        hawaii.click();
        driver.navigate().back();

        cancel();

        teacherCertificationMain();
        WebElement arizona = driver.findElement(By.xpath("//*[@id=\"tb-megamenu-column-11\"]/div/ul/li[4]/a"));
        pageWait.until(ExpectedConditions.visibilityOf(arizona)).isDisplayed();
        Assert.assertEquals(arizona.getText(), "Arizona");
        arizona.click();
        driver.navigate().back();

        cancel();

        WebElement courses = driver.findElement(By.xpath("//*[@id=\"block-mainnavigation-2\"]/div/div/div/ul/li[4]/a"));
        pageWait.until(ExpectedConditions.visibilityOf(courses)).isDisplayed();
        Assert.assertEquals(courses.getText(), "COURSES");
        courses.click();
        driver.navigate().back();

        cancel();

        WebElement hireteachers = driver.findElement(By.xpath("//*[@id=\"block-mainnavigation-2\"]/div/div/div/ul/li[5]"));
        pageWait.until(ExpectedConditions.visibilityOf(hireteachers)).isDisplayed();
        Assert.assertEquals(hireteachers.getText(), "HIRE TEACHERS");
        hireteachers.click();
        driver.navigate().back();
        cancel();

    }

}