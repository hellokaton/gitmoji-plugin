package io.github.biezhi.plugins

import javax.swing.Icon

/**
 * Emoji mapping
 *
 * @author biezhi
 * @date 2017/12/30
 */

class EmojiMapping {

    var map = HashMap<String, EmojiData>()
    val actions: MutableSet<String>

    constructor() {
        map["Improving structure / format of the code."] = EmojiData("art")
        map["Improving performance."] = EmojiData("zap")
        map["Removing code or files."] = EmojiData("fire")
        map["Fixing a bug."] = EmojiData("bug")
        map["Critical hotfix."] = EmojiData("ambulance")
        map["Introducing new features."] = EmojiData("sparkles")
        map["Writing docs."] = EmojiData("pencil")
        map["Deploying stuff."] = EmojiData("rocket")
        map["Updating the UI and style files."] = EmojiData("lipstick")
        map["Initial commit."] = EmojiData("tada")
        map["Adding tests."] = EmojiData("white_check_mark")
        map["Fixing security issues."] = EmojiData("lock")
        map["Fixing something on macOS."] = EmojiData("apple")
        map["Fixing something on Linux."] = EmojiData("penguin")
        map["Fixing something on Windows."] = EmojiData("checkered_flag")
        map["Fixing something on Android."] = EmojiData("robot")
        map["Fixing something on iOS."] = EmojiData("green_apple")
        map["Releasing / Version tags."] = EmojiData("bookmark")
        map["Removing linter warnings."] = EmojiData("rotating_light")
        map["Work in progress."] = EmojiData("construction")
        map["Fixing CI Build."] = EmojiData("green_heart")
        map["Downgrading dependencies."] = EmojiData("arrow_down")
        map["Upgrading dependencies."] = EmojiData("arrow_up")
        map["Pinning dependencies to specific versions."] = EmojiData("pushpin")
        map["Adding CI build system."] = EmojiData("construction_worker")
        map["Adding analytics or tracking code."] = EmojiData("chart_with_upwards_trend")
        map["Refactoring code."] = EmojiData("recycle")
        map["Removing a dependency."] = EmojiData("heavy_minus_sign")
        map["Work about Docker."] = EmojiData("whale")
        map["Adding a dependency."] = EmojiData("heavy_plus_sign")
        map["Changing configuration files."] = EmojiData("wrench")
        map["Internationalization and localization."] = EmojiData("globe_with_meridians")
        map["Fixing typos."] = EmojiData("pencil2")
        map["Writing bad code that needs to be improved."] = EmojiData("poop")
        map["Reverting changes."] = EmojiData("rewind")
        map["Merging branches."] = EmojiData("twisted_rightwards_arrows")
        map["Updating compiled files or packages."] = EmojiData("package")
        map["Updating code due to external API changes."] = EmojiData("alien")
        map["Moving or renaming files."] = EmojiData("truck")
        map["Adding or updating license."] = EmojiData("page_facing_up")
        map["Introducing breaking changes."] = EmojiData("boom")
        map["Adding or updating assets."] = EmojiData("bento")
        map["Updating code due to code review changes."] = EmojiData("ok_hand")
        map["Improving accessibility."] = EmojiData("wheelchair")
        map["Documenting source code."] = EmojiData("bulb")
        map["Writing code drunkenly."] = EmojiData("beers")
        map["Updating text and literals."] = EmojiData("speech_balloon")
        map["Performing database related changes."] = EmojiData("card_file_box")
        map["Adding logs."] = EmojiData("loud_sound")
        map["Removing logs."] = EmojiData("mute")
        map["Add contributor(s)."] = EmojiData("busts_in_silhouette")
        map["Improving user experience / usability."] = EmojiData("children_crossing")
        map["Making architectural changes."] = EmojiData("building_construction")
        map["Working on responsive design."] = EmojiData("iphone")
        map["Mocking things."] = EmojiData("clown_face")
        map["Adding an easter egg."]  = EmojiData("egg")
        map["Adding or updating a .gitignore file."]  = EmojiData("see_no_evil")
        map["Adding or updating snapshots."]  = EmojiData("camera_flash")

        map["改进结构和代码格式"] = EmojiData("art")
        map["优化性能"] = EmojiData("zap")
        map["移除代码或文件"] = EmojiData("fire")
        map["修复 BUG"] = EmojiData("bug")
        map["核心代码修复"] = EmojiData("ambulance")
        map["添加新特性"] = EmojiData("sparkles")
        map["编写文档"] = EmojiData("pencil")
        map["部署程序"] = EmojiData("rocket")
        map["更新界面和样式文件"] = EmojiData("lipstick")
        map["初始化提交"] = EmojiData("tada")
        map["添加测试代码"] = EmojiData("white_check_mark")
        map["修复安全问题"] = EmojiData("lock")
        map["修复 MacOS 平台问题"] = EmojiData("apple")
        map["修复 Linux 平台问题"] = EmojiData("penguin")
        map["修复 Windows 平台问题"] = EmojiData("checkered_flag")
        map["修复 Android 平台问题"] = EmojiData("robot")
        map["修复 IOS 平台问题"] = EmojiData("green_apple")
        map["发布一个版本"] = EmojiData("bookmark")
        map["移除警告信息"] = EmojiData("rotating_light")
        map["正在进行中"] = EmojiData("construction")
        map["修复 CI 构建"] = EmojiData("green_heart")
        map["依赖降级"] = EmojiData("arrow_down")
        map["依赖升级"] = EmojiData("arrow_up")
        map["指定特定版本依赖"] = EmojiData("pushpin")
        map["添加 CI 构建到系统"] = EmojiData("construction_worker")
        map["添加分析或跟踪代码"] = EmojiData("chart_with_upwards_trend")
        map["重构代码"] = EmojiData("recycle")
        map["移除依赖"] = EmojiData("heavy_minus_sign")
        map["在 Docker 中运行"] = EmojiData("whale")
        map["添加依赖"] = EmojiData("heavy_plus_sign")
        map["修改配置文件"] = EmojiData("wrench")
        map["国际化和本地化"] = EmojiData("globe_with_meridians")
        map["修复拼写错误"] = EmojiData("pencil2")
        map["改进垃圾代码"] = EmojiData("poop")
        map["恢复修改"] = EmojiData("rewind")
        map["合并分支"] = EmojiData("twisted_rightwards_arrows")
        map["更新已编译的文件或包"] = EmojiData("package")
        map["由于外部API的改变而更新代码"] = EmojiData("alien")
        map["移动或重命名文件"] = EmojiData("truck")
        map["添加或更新许可"] = EmojiData("page_facing_up")
        map["引入重大变化"] = EmojiData("boom")
        map["添加或更新资源"] = EmojiData("bento")
        map["更新代码，因为代码审核变更"] = EmojiData("ok_hand")
        map["提高可访问性"] = EmojiData("wheelchair")
        map["添加源码注释"] = EmojiData("bulb")
        map["醉酒写代码"] = EmojiData("beers")
        map["更新文本和字面量"] = EmojiData("speech_balloon")
        map["执行数据库相关的变化"] = EmojiData("card_file_box")
        map["添加日志记录"] = EmojiData("loud_sound")
        map["删除日志记录"] = EmojiData("mute")
        map["添加贡献者"] = EmojiData("busts_in_silhouette")
        map["提高用户体验/可用性"] = EmojiData("children_crossing")
        map["架构调整"] = EmojiData("building_construction")
        map["响应式设计"] = EmojiData("iphone")
        map["模拟数据"] = EmojiData("clown_face")
        map["添加一个彩蛋"]  = EmojiData("egg")
        map["添加或更新 .gitignore 文件"]  = EmojiData("see_no_evil")
        map["添加或更新快照"]  = EmojiData("camera_flash")

        this.actions = map.keys
    }

    fun getText(action:String): String? {
        return this.map[action]!!.emojiText
    }

    fun getIcon(action:String): Icon? {
        return this.map[action]!!.icon
    }

}
