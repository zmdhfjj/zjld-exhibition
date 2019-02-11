$(document).ready(function(){

    function anim(elem , animation) {
        elem.addClass(animation + ' animated').one('webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend', function(){
            $(this).removeClass(animation + ' animated');
            console.log('end');
        });
    };


    /* animation */
    $('.shadow-layer-box').mouseenter(function(){
        $(this).find('.hide-animate-row').addClass('show-animate');
        anim($(this).find('.hide-animate-row'),'fadeInUp');
    });

    $('.shadow-layer-box').mouseleave(function(){
        $(this).find('.hide-animate-row').removeClass('show-animate');
        $(this).find('.hide-animate-row').removeClass('fadeInUp' + ' animated');
    });

    $('.news-row').mouseenter(function(){
        $(this).find('span').css('color','#00A357');
    });

    $('.news-row').mouseleave(function(){
        $(this).find('span').css('color','');
    });

    $('.layui-btn').mouseenter(function(){
        var bImg = $(this).find('.btn-img');
        if(bImg){
            bImg.animate({right:'-=10px'});
        }
    });

    $('.layui-btn').mouseleave(function(){
        var bImg = $(this).find('.btn-img');
        if(bImg){
            bImg.animate({right:'+=10px'});
        }
    });

    $('.advantage-window').mouseenter(function(){
        var show = $(this).find('.show-adv-img');
        var hide = $(this).find('.hide-adv-img');
        var top_img = $(this).find('.advantage-top-img');
        var title = $(this).find('.advantage-title');
        var container = $(this).find('.advantage-container');
        container.animate({top:'-=80px'},100);
        title.addClass('advantage-title-bottom');
        top_img.addClass('opacity-zero');
        show.addClass('hide');
        hide.removeClass('hide');
        // anim(hide,'zoomIn');
    });

    $('.advantage-window').mouseleave(function(){
        var show = $(this).find('.show-adv-img');
        var hide = $(this).find('.hide-adv-img');
        var top_img = $(this).find('.advantage-top-img');
        var title = $(this).find('.advantage-title');
        var container = $(this).find('.advantage-container');
        container.animate({top:'+=80px'},100,function(){
            top_img.removeClass('opacity-zero');
        });
        title.removeClass('advantage-title-bottom');

        hide.addClass('hide');
        show.removeClass('hide');
        // hide.removeClass('zoomIn' + ' animated');
    });
});



