require 'rouge' unless defined? ::Rouge.version

module Rouge; module Themes
  class Custom < CSSTheme
    name 'slm-rouge-theme'

    # https://gist.github.com/flinhong/f37f0271bcada97b383bf9f81d8942e7
    style Comment,                   :fg => '#8C8C8C'
    style Comment::Preproc,          :fg => '#cc0000'
    style Comment::Special,          :fg => '#cc0000'

    style Error,                     :fg => '#a61717'
    style Generic::Error,            :fg => '#aa0000'

    style Generic::Heading,          :fg => '#333333'
    style Generic::Subheading,       :fg => '#666666'

    style Generic::Deleted,          :fg => '#EFEFEF'
    style Generic::Inserted,         :fg => '#EFEFEF'

    style Generic::Emph,             :italic => true
    style Generic::Strong,           :bold => true

    style Generic::Lineno,           :fg => '#888888'
    style Generic::Output,           :fg => '#888888'
    style Generic::Prompt,           :fg => '#555555'
    style Generic::Traceback,        :fg => '#aa0000'

    # style Keyword,                   :fg => '#008800', :bold => true
    style Keyword,                   :fg => '#0031B3'
    style Keyword::Pseudo,           :fg => '#0031B3'
    style Keyword::Type,             :fg => '#0031B3'

    style Num,                       :fg => '#0000dd'

    style Str,                       :fg => '#067D17'
    style Str::Affix,                :fg => '#008800'
    style Str::Escape,               :fg => '#0044dd'
    style Str::Interpol,             :fg => '#3333bb'
    style Str::Other,                :fg => '#22bb22'
    #style Str::Regex,                :fg => '#008800', :bg => '#fff0ff'
    # The background color on regex really doesn't look good, so let's drop it
    style Str::Regex,                :fg => '#008800'
    style Str::Symbol,               :fg => '#aa6600'

    style Name,                      :fg => '#871094'
    style Name::Attribute,           :fg => '#871094'
    style Name::Builtin,             :fg => '#003388'
    style Name::Class,               :fg => '#000000'
    style Name::Constant,            :fg => '#871094', :italic => true
    style Name::Decorator,           :fg => '#555555'
    style Name::Exception,           :fg => '#bb0066'
    style Name::Function,            :fg => '#00627A'
    #style Name::Label,              :fg => '#336699', :italic => true
    # Name::Label is used for built-in CSS properties in Rouge, so let's drop italics
    style Name::Label,               :fg => '#336699'
    style Name::Namespace,           :fg => '#000000'
    style Name::Property,            :fg => '#336699'
    style Name::Tag,                 :fg => '#000000' # package
    style Name::Variable,            :fg => '#336699'
    style Name::Variable::Global,    :fg => '#dd7700'
    # style Name::Variable::Instance,  :fg => '#3333bb'
    style Name::Variable::Instance,  :fg => '#871094'

    style Operator::Word,            :fg => '#008800'

    style Text,                      {}
    style Text::Whitespace,          :fg => '#bbbbbb'
  end
end; end