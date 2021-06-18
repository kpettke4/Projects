<?php

use yii\helpers\Html;

/* @var $this yii\web\View */
/* @var $model app\models\Zamowienia */

$this->title = 'Create Zamowienia';
$this->params['breadcrumbs'][] = ['label' => 'Zamowienias', 'url' => ['index']];
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="zamowienia-create">

    <h1><?= Html::encode($this->title) ?></h1>

    <?= $this->render('_form', [
        'model' => $model,
    ]) ?>

</div>
