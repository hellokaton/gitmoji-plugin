package io.github.biezhi.plugins

/**
 * Emoji mapping
 *
 * @author biezhi
 * @date 2017/12/30
 */

class EmojiMapping {

    private var map = HashMap<String, String>()
    val actions: MutableSet<String>
        get() {
            return map.keys
        }

    init {
        val art = "\uD83C\uDFA8"
        val zap = "⚡️"
        val fire = "\uD83D\uDD25"
        val bug = "\uD83D\uDC1B"
        val ambulance = "\uD83D\uDE91"
        val sparkles = "✨"
        val memo = "\uD83D\uDCDD"
        val rocket = "\uD83D\uDE80"
        val lipstick = "\uD83D\uDC84"
        val tada = "\uD83C\uDF89"
        val whiteCheckMark = "✅"
        val lock = "\uD83D\uDD12"
        val redApple = "\uD83C\uDF4E"
        val penguin = "\uD83D\uDC27"
        val checkeredFlag = "\uD83C\uDFC1"
        val robot = "\uD83E\uDD16"
        val greenApple = "\uD83C\uDF4F"
        val bookmark = "\uD83D\uDD16"
        val rotatingLight = "\uD83D\uDEA8"
        val construction = "\uD83D\uDEA7"
        val greenHeart = "\uD83D\uDC9A"
        val arrowDown = "⬇️"
        val arrowUp = "⬆️"
        val pushpin = "\uD83D\uDCCC"
        val constructionWorker = "\uD83D\uDC77"
        val chartWithUpwardsTrend = "\uD83D\uDCC8"
        val recycle = "♻️"
        val heavyMinusSign = "➖"
        val whale = "\uD83D\uDC33"
        val heavyPlusSign = "➕"
        val wrench = "\uD83D\uDD27"
        val globeWithMeridians = "\uD83C\uDF10"
        val pencil2 = "✏️"
        val hankey = "\uD83D\uDCA9"
        val rewind = "⏪"
        val twistedRightwardsArrows = "\uD83D\uDD00"
        val package_ = "\uD83D\uDCE6"
        val alien = "\uD83D\uDC7D"
        val truck = "\uD83D\uDE9A"
        val pageFacingUp = "\uD83D\uDCC4"
        val boom = "\uD83D\uDCA5"
        val bento = "\uD83C\uDF71"
        val okHand = "\uD83D\uDC4C"
        val wheelchair = "♿️"
        val bulb = "\uD83D\uDCA1"
        val beers = "\uD83C\uDF7B"
        val speechBalloon = "\uD83D\uDCAC"
        val cardFileBox = "\uD83D\uDDC3"
        val loudSound = "\uD83D\uDD0A"
        val mute = "\uD83D\uDD07"
        val bustsInSilhouette = "\uD83D\uDC65"
        val childrenCrossing = "\uD83D\uDEB8"
        val buildingConstruction = "\uD83C\uDFD7"
        val iphone = "\uD83D\uDCF1"
        val clownFace = "\uD83E\uDD21"
        val egg = "\uD83E\uDD5A"
        val seeNoEvil = "\uD83D\uDE48"
        val cameraFlash = "\uD83D\uDCF8"

        map["Improving structure / format of the code."] = art
        map["Improving performance."] = zap
        map["Removing code or files."] = fire
        map["Fixing a bug."] = bug
        map["Critical hotfix."] = ambulance
        map["Introducing new features."] = sparkles
        map["Writing docs."] = memo
        map["Deploying stuff."] = rocket
        map["Updating the UI and style files."] = lipstick
        map["Initial commit."] = tada
        map["Adding tests."] = whiteCheckMark
        map["Fixing security issues."] = lock
        map["Fixing something on macOS."] = redApple
        map["Fixing something on Linux."] = penguin
        map["Fixing something on Windows."] = checkeredFlag
        map["Fixing something on Android."] = robot
        map["Fixing something on iOS."] = greenApple
        map["Releasing / Version tags."] = bookmark
        map["Removing linter warnings."] = rotatingLight
        map["Work in progress."] = construction
        map["Fixing CI Build."] = greenHeart
        map["Downgrading dependencies."] = arrowDown
        map["Upgrading dependencies."] = arrowUp
        map["Pinning dependencies to specific versions."] = pushpin
        map["Adding CI build system."] = constructionWorker
        map["Adding analytics or tracking code."] = chartWithUpwardsTrend
        map["Refactoring code."] = recycle
        map["Removing a dependency."] = heavyMinusSign
        map["Work about Docker."] = whale
        map["Adding a dependency."] = heavyPlusSign
        map["Changing configuration files."] = wrench
        map["Internationalization and localization."] = globeWithMeridians
        map["Fixing typos."] = pencil2
        map["Writing bad code that needs to be improved."] = hankey
        map["Reverting changes."] = rewind
        map["Merging branches."] = twistedRightwardsArrows
        map["Updating compiled files or packages."] = package_
        map["Updating code due to external API changes."] = alien
        map["Moving or renaming files."] = truck
        map["Adding or updating license."] = pageFacingUp
        map["Introducing breaking changes."] = boom
        map["Adding or updating assets."] = bento
        map["Updating code due to code review changes."] = okHand
        map["Improving accessibility."] = wheelchair
        map["Documenting source code."] = bulb
        map["Writing code drunkenly."] = beers
        map["Updating text and literals."] = speechBalloon
        map["Performing database related changes."] = cardFileBox
        map["Adding logs."] = loudSound
        map["Removing logs."] = mute
        map["Add contributor(s)."] = bustsInSilhouette
        map["Improving user experience / usability."] = childrenCrossing
        map["Making architectural changes."] = buildingConstruction
        map["Working on responsive design."] = iphone
        map["Mocking things."] = clownFace
        map["Adding an easter egg."] = egg
        map["Adding or updating a .gitignore file."] = seeNoEvil
        map["Adding or updating snapshots."] = cameraFlash

        map["改进结构和代码格式"] = art
        map["优化性能"] = zap
        map["移除代码或文件"] = fire
        map["修复 BUG"] = bug
        map["核心代码修复"] = ambulance
        map["添加新特性"] = sparkles
        map["编写文档"] = memo
        map["部署程序"] = rocket
        map["更新界面和样式文件"] = lipstick
        map["初始化提交"] = tada
        map["添加测试代码"] = whiteCheckMark
        map["修复安全问题"] = lock
        map["修复 MacOS 平台问题"] = redApple
        map["修复 Linux 平台问题"] = penguin
        map["修复 Windows 平台问题"] = checkeredFlag
        map["修复 Android 平台问题"] = robot
        map["修复 IOS 平台问题"] = greenApple
        map["发布一个版本"] = bookmark
        map["移除警告信息"] = rotatingLight
        map["正在进行中"] = construction
        map["修复 CI 构建"] = greenHeart
        map["依赖降级"] = arrowDown
        map["依赖升级"] = arrowUp
        map["指定特定版本依赖"] = pushpin
        map["添加 CI 构建到系统"] = constructionWorker
        map["添加分析或跟踪代码"] = chartWithUpwardsTrend
        map["重构代码"] = recycle
        map["移除依赖"] = heavyMinusSign
        map["在 Docker 中运行"] = whale
        map["添加依赖"] = heavyPlusSign
        map["修改配置文件"] = wrench
        map["国际化和本地化"] = globeWithMeridians
        map["修复拼写错误"] = pencil2
        map["改进垃圾代码"] = hankey
        map["恢复修改"] = rewind
        map["合并分支"] = twistedRightwardsArrows
        map["更新已编译的文件或包"] = package_
        map["由于外部API的改变而更新代码"] = alien
        map["移动或重命名文件"] = truck
        map["添加或更新许可"] = pageFacingUp
        map["引入重大变化"] = boom
        map["添加或更新资源"] = bento
        map["更新代码，因为代码审核变更"] = okHand
        map["提高可访问性"] = wheelchair
        map["添加源码注释"] = bulb
        map["醉酒写代码"] = beers
        map["更新文本和字面量"] = speechBalloon
        map["执行数据库相关的变化"] = cardFileBox
        map["添加日志记录"] = loudSound
        map["删除日志记录"] = mute
        map["添加贡献者"] = bustsInSilhouette
        map["提高用户体验/可用性"] = childrenCrossing
        map["架构调整"] = buildingConstruction
        map["响应式设计"] = iphone
        map["模拟数据"] = clownFace
        map["添加一个彩蛋"] = egg
        map["添加或更新 .gitignore 文件"] = seeNoEvil
        map["添加或更新快照"] = cameraFlash
    }

    fun getText(action: String): String? {
        return this.map[action]!!
    }
}
